package com.weather.weatherdata.repositories;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



@Repository
@Getter
//@RequiredArgsConstructor
public class RepositoryCatalog implements ICatalogData{

    private final AlertsRepository alerts;
    private final CurrentWeatherRepository weather;
    private final ForecastRepository forecast;
    private final LocationRepository location;


    public RepositoryCatalog(AlertsRepository alerts, CurrentWeatherRepository weather, ForecastRepository forecast, LocationRepository location) {
        this.alerts = alerts;
        this.weather = weather;
        this.forecast = forecast;
        this.location = location;
    }

    @Override
    public AlertsRepository getAlerts() {
        return alerts;
    }

    @Override
    public CurrentWeatherRepository getCurrentWeather() {
        return weather;
    }

    @Override
    public ForecastRepository getForecast() {
        return forecast;
    }

    @Override
    public LocationRepository getLocations() {
        return location;
    }
}
