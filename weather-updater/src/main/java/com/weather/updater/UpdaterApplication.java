package com.weather.updater;

import com.weather.client.IWeatherClient;
import com.weather.updater.mappers.ICatalogMappers;
import com.weather.updater.updater.WeatherUpdater;
import com.weather.weatherdata.model.Location;
import com.weather.weatherdata.repositories.ICatalogData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;


@EnableJpaRepositories
@SpringBootApplication(scanBasePackages = "com.weather")
//@EnableJpaRepositories
public class UpdaterApplication implements CommandLineRunner{


	final ICatalogMappers mappers;
	final ICatalogData dataBase;
	final IWeatherClient client;


	public UpdaterApplication(ICatalogMappers mappers,
							  ICatalogData dataBase,
							  IWeatherClient client) {
		this.mappers = mappers;
		this.dataBase = dataBase;
		this.client = client;
	}

	public static void main(String[] args) {
		SpringApplication.run(UpdaterApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {

	}


}


