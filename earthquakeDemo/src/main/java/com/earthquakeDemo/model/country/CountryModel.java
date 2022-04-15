package com.earthquakeDemo.model.country;

import java.util.List;


public class CountryModel {
    private long place_id;
    private String licence;
    private String osm_type;
    private long osm_id;
    private List<String> boundingbox;
    private String lat;
    private String lon;
    private String display_name;
    private int place_rank;
    private String category;
    private String type;
    private double importance;
    private String icon;

    public CountryModel() {
    }

    public CountryModel(long place_id, String licence, String osm_type, long osm_id, List<String> boundingbox, String lat, String lon, String display_name, int place_rank, String category, String type, double importance, String icon) {
        this.place_id = place_id;
        this.licence = licence;
        this.osm_type = osm_type;
        this.osm_id = osm_id;
        this.boundingbox = boundingbox;
        this.lat = lat;
        this.lon = lon;
        this.display_name = display_name;
        this.place_rank = place_rank;
        this.category = category;
        this.type = type;
        this.importance = importance;
        this.icon = icon;
    }

    public long getPlace_id() {
        return place_id;
    }

    public void setPlace_id(long place_id) {
        this.place_id = place_id;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getOsm_type() {
        return osm_type;
    }

    public void setOsm_type(String osm_type) {
        this.osm_type = osm_type;
    }

    public long getOsm_id() {
        return osm_id;
    }

    public void setOsm_id(long osm_id) {
        this.osm_id = osm_id;
    }

    public List<String> getBoundingbox() {
        return boundingbox;
    }

    public void setBoundingbox(List<String> boundingbox) {
        this.boundingbox = boundingbox;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public int getPlace_rank() {
        return place_rank;
    }

    public void setPlace_rank(int place_rank) {
        this.place_rank = place_rank;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getImportance() {
        return importance;
    }

    public void setImportance(double importance) {
        this.importance = importance;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "CountriesModel{" +
                "place_id=" + place_id +
                ", licence='" + licence + '\'' +
                ", osm_type='" + osm_type + '\'' +
                ", osm_id=" + osm_id +
                ", boundingBox=" + boundingbox +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                ", display_name='" + display_name + '\'' +
                ", place_rank=" + place_rank +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                ", importance=" + importance +
                ", icon='" + icon + '\'' +
                '}';
    }
}
