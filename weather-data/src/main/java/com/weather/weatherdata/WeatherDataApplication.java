package com.weather.weatherdata;

import com.weather.weatherdata.repositories.ICatalogData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;



@EnableJpaRepositories
@SpringBootApplication
public class WeatherDataApplication implements CommandLineRunner {
	private final ICatalogData dataCatalog;

	public WeatherDataApplication(ICatalogData dataCatalog){
		this.dataCatalog = dataCatalog;
	}

	public static void main(String[] args) {
		SpringApplication.run(WeatherDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
