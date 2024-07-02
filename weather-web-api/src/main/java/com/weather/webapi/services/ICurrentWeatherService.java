package com.weather.webapi.services;

import com.weather.webapi.contract.AlertsDto;
import com.weather.webapi.contract.CurrentWeatherDto;
import org.springframework.stereotype.Component;


@Component
public interface ICurrentWeatherService {
    CurrentWeatherDto getCurrentWeather(String cityName);
    void deleteCurrentWeather(long id);
    AlertsDto getAlerts(String cityName);
    void deleteAlerts(long id);
}
