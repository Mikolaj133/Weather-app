package com.weather.webapi.mappers;

import com.weather.weatherdata.model.CurrentWeather;
import com.weather.webapi.contract.CurrentWeatherDto;
import org.springframework.stereotype.Component;

@Component
public class WeatherMapper implements IMap<CurrentWeatherDto, CurrentWeather>{

    @Override
    public CurrentWeather map(CurrentWeatherDto dto) {
        CurrentWeather weather = new CurrentWeather();
        weather.setTemperature(dto.getTemperature());
        weather.setApparentTemperature(dto.getApparentTemperature());
        weather.setAirQualityIndex(dto.getAirQualityIndex());
        weather.setCloudCover(dto.getCloudCover());
        weather.setDateTime(dto.getDatetime());
        weather.setPressure(dto.getPressure());
        weather.setSnowFallInLastHour(dto.getSnowFall());
        weather.setSunrise(dto.getSunrise());
        weather.setSunset(dto.getSunset());
        weather.setWindDirection(dto.getWindCardinalDirection());
        weather.setWindSpeed(dto.getWindSpeed());
        weather.setCityName(dto.getCityName());
        return weather;
    }
}

@Component
class WeatherToDtoMapper implements IMap<CurrentWeather, CurrentWeatherDto>{

    @Override
    public CurrentWeatherDto map(CurrentWeather item) {
        CurrentWeatherDto weather = new CurrentWeatherDto();
        weather.setTemperature(item.getTemperature());
        weather.setApparentTemperature(item.getApparentTemperature());
        weather.setAirQualityIndex(item.getAirQualityIndex());
        weather.setCloudCover(item.getCloudCover());
        weather.setDatetime(item.getDateTime());
        weather.setPressure(item.getPressure());
        weather.setSnowFall(item.getSnowFallInLastHour());
        weather.setSunrise(item.getSunrise());
        weather.setSunset(item.getSunset());
        weather.setWindCardinalDirection(item.getWindDirection());
        weather.setWindSpeed(item.getWindSpeed());
        weather.setCityName(item.getCityName());
        return weather;
    }
}
