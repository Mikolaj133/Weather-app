package com.weather.webapi.mappers;

import com.weather.weatherdata.model.Forcast;
import com.weather.webapi.contract.ForcastDto;
import org.springframework.stereotype.Component;

@Component
public class ForecastMaper implements IMap<ForcastDto, Forcast>{
    @Override
    public Forcast map(ForcastDto dto) {
        var forecast = new Forcast();
        forecast.setSnow(dto.getSnow());
        forecast.setSnowDepth(dto.getSnowDepth());
        forecast.setPrecip(dto.getPrecip());
        forecast.setTemp(dto.getTemp());
        forecast.setMaxTemp(dto.getMaxTemp());
        forecast.setMinTemp(dto.getMinTemp());
        forecast.setAppMaxTemp(dto.getAppMaxTemp());
        forecast.setAppMinTemp(dto.getAppMinTemp());
        forecast.setClouds(dto.getClouds());
        forecast.setPres(dto.getPres());
        forecast.setUv(dto.getUv());
        forecast.setMoonPhase(dto.getMoonPhase());
        forecast.setSunriseTs(dto.getSunriseTs());
        forecast.setSunsetTs(dto.getSunsetTs());
        forecast.setMoonriseTs(dto.getMoonriseTs());
        forecast.setMoonsetTs(dto.getMoonsetTs());
        forecast.setWindSpd(dto.getWindSpd());
        forecast.setWindDir(dto.getWindDir());
        forecast.setWindCdir(dto.getWindCdir());
        forecast.setWindCdirFull(dto.getWindCdirFull());
        forecast.setCityName(dto.getCityName());
        return forecast;
    }
}

@Component
class ForecastToDtoMapper implements IMap<Forcast, ForcastDto>{
    @Override
    public ForcastDto map(Forcast entity) {
        var dto = new ForcastDto();
        dto.setDatetime(entity.getDatetime());
        dto.setSnow(entity.getSnow());
        dto.setSnowDepth(entity.getSnowDepth());
        dto.setPrecip(entity.getPrecip());
        dto.setTemp(entity.getTemp());
        dto.setMaxTemp(entity.getMaxTemp());
        dto.setMinTemp(entity.getMinTemp());
        dto.setAppMaxTemp(entity.getAppMaxTemp());
        dto.setAppMinTemp(entity.getAppMinTemp());
        dto.setClouds(entity.getClouds());
        dto.setPres(entity.getPres());
        dto.setUv(entity.getUv());
        dto.setMoonPhase(entity.getMoonPhase());
        dto.setSunriseTs(entity.getSunriseTs());
        dto.setSunsetTs(entity.getSunsetTs());
        dto.setMoonriseTs(entity.getMoonriseTs());
        dto.setMoonsetTs(entity.getMoonsetTs());
        dto.setWindSpd(entity.getWindSpd());
        dto.setWindDir(entity.getWindDir());
        dto.setWindCdir(entity.getWindCdir());
        dto.setWindCdirFull(entity.getWindCdirFull());
        dto.setCityName(entity.getCityName());
        return dto;
    }
}
