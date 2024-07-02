package com.weather.updater.mappers;

import com.weather.client.contract.AlertsDto;
import com.weather.client.contract.CurrentWeatherDto;
import com.weather.client.contract.ForecastDto;
import com.weather.weatherdata.model.Alerts;
import com.weather.weatherdata.model.CurrentWeather;
import com.weather.weatherdata.model.Forcast;
import com.weather.weatherdata.model.Location;
import org.springframework.stereotype.Component;


public interface ICatalogMappers {
    IMapEntities<AlertsDto , Alerts> forAlerts();
    IMapEntities<CurrentWeatherDto, CurrentWeather> forCurWeather();
    IMapEntities<ForecastDto , Forcast> forForcast();

}
