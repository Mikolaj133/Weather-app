package com.weather.client;

import com.weather.client.contract.AlertsDto;
import com.weather.client.contract.CurrentWeatherDto;
import com.weather.client.contract.ForecastDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherClient implements IWeatherClient{


    RestTemplate restClient;
    String baseUrl;
    String apiKey;

    String version;
    private final IWeatherClientSettings _settings;


        @Autowired
        public WeatherClient(IWeatherClientSettings _settings) {
        restClient = new RestTemplate();
        this.baseUrl = _settings.getBaseUrl();
        this.apiKey = _settings.getApiKey();
        this.version = _settings.getApiVersion();
        this._settings = _settings;

    }
    @Override
    public AlertsDto getAlerts(String city) {
        var url = _settings.getUrlBuilder()
                .pathSegment("alerts")
                .queryParam("city", city)
                .build()
                .toUriString();
       // System.out.println("API URL: " + url); // Print the URL

        return restClient.getForObject(url, AlertsDto.class);
    }

    @Override
    public CurrentWeatherDto getCurrentWeather(String city) {
            var url = _settings.getUrlBuilder()
                    .pathSegment("current")
                    .queryParam("city" , city)
                    .build()
                    .toUriString();

        return restClient.getForObject(url , CurrentWeatherDto.class);
    }

    @Override
    public ForecastDto getForcastWeather(String city) {
            var url = _settings.getUrlBuilder()
                    .pathSegment("forecast")
                    .pathSegment("daily")
                    .queryParam("city",city)
                    .build()
                    .toUriString();

        return restClient.getForObject(url, ForecastDto.class);
    }
}
