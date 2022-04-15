package com.earthquakeDemo;

import com.earthquakeDemo.model.ConsoleResponseModel;
import com.earthquakeDemo.service.EarthQuakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.scanner.Scanner;

import java.util.List;

@SpringBootApplication
public class EarthquakeDemoApplication implements CommandLineRunner {

	@Autowired
	private EarthQuakeService earthQuakeService;

	public static void main(String[] args) {
		SpringApplication.run(EarthquakeDemoApplication.class, args);
	}

	@Override
	public void run(String... args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter country :");
		String country = input.nextLine();
		System.out.println("Please enter the number of days :");
		int pastXDays = input.nextInt();

		List<ConsoleResponseModel> response = earthQuakeService.earthquakes(country, pastXDays);

		if (response.isEmpty()) {
			System.out.println("No Earthquakes were recorded past " + pastXDays + " days");
		} else {
			System.out.println("Country \t Place \t\t\t Date \t Magnitude");
			for (ConsoleResponseModel r: response) {
				System.out.println(r.getCountry() + " " + r.getPlace() + " " + r.getDateTime() + " " + r.getMagnitude());
			}
		}
	}
}
