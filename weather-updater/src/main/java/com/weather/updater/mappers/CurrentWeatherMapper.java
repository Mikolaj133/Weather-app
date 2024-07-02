package com.weather.updater.mappers;

import com.weather.client.contract.CurrentWeatherDto;
import com.weather.weatherdata.model.CurrentWeather;
import org.springframework.stereotype.Component;


@Component
public class CurrentWeatherMapper implements IMapEntities<CurrentWeatherDto, CurrentWeather>{

    @Override
    public CurrentWeather toEntity(CurrentWeatherDto dto) {
        return map(dto , new CurrentWeather());
    }

    @Override
    public CurrentWeather map(CurrentWeatherDto dto, CurrentWeather currentWeather) {
        currentWeather.setHumidity(dto.getHumidity());
        currentWeather.setWindDirection(dto.getWindCardinalDirection());
        currentWeather.setWindSpeed(dto.getWindSpeed());
        currentWeather.setTemperature(dto.getTemperature());
        currentWeather.setApparentTemperature(dto.getApparentTemperature());
        currentWeather.setCloudCover(dto.getClouds());
        currentWeather.setDateTime(dto.getDatetime());
        currentWeather.setPressure(dto.getPressure());
        currentWeather.setSunrise(dto.getSunrise());
        currentWeather.setSunset(dto.getSunset());
        currentWeather.setAirQualityIndex(dto.getAirQualityIndex());
        currentWeather.setPrecipitationInLastHour(dto.getPrecipitation());
        currentWeather.setSnowFallInLastHour(dto.getSnowfall());
        currentWeather.setObservationTime(dto.getObservationTime());
        currentWeather.setCityName(dto.getCityName());
//        currentWeather.setLocation(dto.getLocation());
        return currentWeather;
    }
}
