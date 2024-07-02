package com.weather.weatherdata.repositories;

import org.springframework.stereotype.Component;

import java.util.Properties;


public interface ICatalogData {
    AlertsRepository getAlerts();
    CurrentWeatherRepository getCurrentWeather();
    ForecastRepository getForecast();
    LocationRepository getLocations();
}
