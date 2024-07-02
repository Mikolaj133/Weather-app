package com.weather.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WeatherClientSerttings implements IWeatherClientSettings {

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.host}")
    private String baseUrl;

    @Value("${weather.api.version}")
    private String apiVersion;

    @Override
    public String getApiKey() {
        return apiKey;
    }

    @Override
    public String getBaseUrl() {
        return baseUrl;
    }

    @Override
    public String getApiVersion() {
        return apiVersion;
    }

}
