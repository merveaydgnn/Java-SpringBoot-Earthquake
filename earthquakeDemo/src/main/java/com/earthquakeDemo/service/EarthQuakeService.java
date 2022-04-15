package com.earthquakeDemo.service;

import com.earthquakeDemo.model.ConsoleResponseModel;
import com.earthquakeDemo.model.country.CountryModel;
import com.earthquakeDemo.model.earthquake.EarthQuakeModel;
import com.earthquakeDemo.model.earthquake.FeatureModel;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Service
public class EarthQuakeService {

    public List<ConsoleResponseModel> earthquakes(String countryName, int pastXDays) {
        List<ConsoleResponseModel> consoleResponseModel = new ArrayList<>();
        CountryModel country = getCountry(countryName);

        EarthQuakeModel earthQuakeModel = getEarthquake(
                Float.parseFloat(country.getBoundingbox().get(0)),
                Float.parseFloat(country.getBoundingbox().get(1)),
                Float.parseFloat(country.getBoundingbox().get(2)),
                Float.parseFloat(country.getBoundingbox().get(3)),
                Instant.now().minus(pastXDays, ChronoUnit.DAYS));

        for (FeatureModel featureModel: earthQuakeModel.getFeatures()) {
            String[] place = featureModel.getProperties().getPlace().split(",");

            consoleResponseModel.add(new ConsoleResponseModel(
                    place[place.length - 1],
                    featureModel.getProperties().getPlace(),
                    featureModel.getProperties().getMag(),
                    Instant.ofEpochMilli(featureModel.getProperties().getTime()))
            );
        }

        return consoleResponseModel;
    }

    private CountryModel getCountry(String countryName) {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        return restTemplate.
                getForObject("https://nominatim.openstreetmap.org/search.php?q=" + countryName + "&format=jsonv2",
                        CountryModel[].class)[0];
    }

    private EarthQuakeModel getEarthquake(
            float minLatitude, float maxLatitude,
            float minLongitude, float maxLongitude,
            Instant startTime
    ) {
        LocalDateTime startDate = LocalDateTime.ofInstant(startTime, ZoneOffset.UTC);
        LocalDateTime endDate = LocalDateTime.ofInstant(Instant.now(), ZoneOffset.UTC);

        String formattedStartDate = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(startDate);
        String formattedEndDate = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(endDate);

        RestTemplate restTemplate = new RestTemplateBuilder().build();
        return restTemplate.
                getForObject("https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson" +
                                "&starttime=" + formattedStartDate +
                                "&endtime=" + formattedEndDate +
                                "&minlatitude=" + minLatitude +
                                "&minlongitude=" + minLongitude +
                                "&maxlongitude=" + maxLongitude +
                                "&maxlatitude=" + maxLatitude,
                        EarthQuakeModel.class);
    }
}
