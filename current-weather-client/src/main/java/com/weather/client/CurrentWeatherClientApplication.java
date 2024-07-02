package com.weather.client;

import com.weather.client.contract.AlertsDto;
import com.weather.client.contract.CurrentWeatherDto;
import com.weather.client.contract.CurrentWeatherResult;
import com.weather.client.contract.ForecastDto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CurrentWeatherClientApplication implements CommandLineRunner {

	RestTemplate restClient;
	String baseUrl;
	String apiKey;
	String apiVersion;

	IWeatherClientSettings settings;

	public CurrentWeatherClientApplication(IWeatherClientSettings settings) {
		restClient = new RestTemplate();
		this.baseUrl = settings.getBaseUrl();
		this.apiKey = settings.getApiKey();
		this.apiVersion = settings.getApiVersion();
		this.settings = settings;
	}

	public static void main(String[] args) {
		SpringApplication.run(CurrentWeatherClientApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		IWeatherClient weatherClient = new WeatherClient(settings);
		checkItOut(weatherClient);
	}


	public static void checkItOut(IWeatherClient weatherClient) {
		var city = "Żyrardów";
//
//		CurrentWeatherDto currentWeatherResult = weatherClient.getCurrentWeather(city);
//		for(var weather : currentWeatherResult.getData()){
//			System.out.println(weather.toString());
//		}

//		if (currentWeatherResult != null && currentWeatherResult.getData() != null && !currentWeatherResult.getData().isEmpty()) {
//			CurrentWeatherDto currentWeather = currentWeatherResult.getData().get();
//			System.out.println(currentWeather.getTempreture());
//		} else {
//			System.out.println("No data found for the specified city.");
//		}
//
//		AlertsDto alerts = weatherClient.getAlerts(city);
//		if (alerts.getAlertsData() != null) {
//			for (var val : alerts.getAlertsData()) {
//				System.out.println(val.toString());
//			}
////
//		}
//		else{
//				System.out.println("No alerts Found in this area.");
//			}
//
//		ForecastDto forecast = weatherClient.getForcastWeather(city);
//		for(var val : forecast.getData()){
//			System.out.println(val.toString());
//		}
		}
	}


