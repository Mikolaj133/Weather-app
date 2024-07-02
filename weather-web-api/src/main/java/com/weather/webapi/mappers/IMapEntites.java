package com.weather.webapi.mappers;

import com.weather.weatherdata.model.Alerts;
import com.weather.weatherdata.model.CurrentWeather;
import com.weather.weatherdata.model.Forcast;
import com.weather.webapi.contract.AlertsDto;
import com.weather.webapi.contract.CurrentWeatherDto;
import com.weather.webapi.contract.ForcastDto;

public interface IMapEntites {
    IMap<CurrentWeather , CurrentWeatherDto> getCurrentWeatherToDtoMapper();
    IMap<Alerts,AlertsDto> getAlertsToDtoMapper();

    IMap<Forcast , ForcastDto> getForcastToDtoMapper();


}
