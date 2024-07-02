package com.weather.client;

import com.weather.client.contract.AlertsDto;
import com.weather.client.contract.CurrentWeatherDto;
import com.weather.client.contract.ForecastDto;

public interface IWeatherClient {
    AlertsDto getAlerts(String city);

    CurrentWeatherDto getCurrentWeather(String city);

    ForecastDto getForcastWeather(String city);

}
