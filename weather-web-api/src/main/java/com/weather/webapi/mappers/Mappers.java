package com.weather.webapi.mappers;

import com.weather.weatherdata.model.Alerts;
import com.weather.weatherdata.model.CurrentWeather;
import com.weather.weatherdata.model.Forcast;
import com.weather.webapi.contract.AlertsDto;
import com.weather.webapi.contract.CurrentWeatherDto;
import com.weather.webapi.contract.ForcastDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
@Getter
@Setter
public class Mappers implements IMapEntites {
   private final IMap<AlertsDto, Alerts> alertsMapper;
    private final IMap<CurrentWeatherDto, CurrentWeather> currentWeatherMapper;
    private final IMap<CurrentWeather , CurrentWeatherDto> currentWeatherToDtoMapper;
    private final IMap<Alerts,AlertsDto> alertsToDtoMapper;
    private final IMap<ForcastDto, Forcast> forcastMapper;
    private final IMap<Forcast, ForcastDto> forcastToDtoMapper;

}


