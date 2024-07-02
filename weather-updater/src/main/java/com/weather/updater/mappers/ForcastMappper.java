package com.weather.updater.mappers;

import com.weather.client.contract.ForecastDto;
import com.weather.weatherdata.model.Forcast;
import org.springframework.stereotype.Component;


@Component
public class ForcastMappper implements IMapEntities<ForecastDto, Forcast>{
    @Override
    public Forcast toEntity(ForecastDto dto) {
        return map(dto , new Forcast());
    }
    @Override
    public Forcast map(ForecastDto dto, Forcast forecast) {

        forecast.setTs(dto.getTs());
        forecast.setDatetime(dto.getDatetime());
        forecast.setSnow(dto.getSnow());
        forecast.setSnowDepth(dto.getSnowDepth());
        forecast.setPrecip(dto.getPrecip());
        forecast.setTemp(dto.getTemp());
        forecast.setDewpt(dto.getDewpt());
        forecast.setMaxTemp(dto.getMaxTemp());
        forecast.setMinTemp(dto.getMinTemp());
        forecast.setAppMaxTemp(dto.getAppMaxTemp());
        forecast.setAppMinTemp(dto.getAppMinTemp());
        forecast.setRh(dto.getRh());
        forecast.setClouds(dto.getClouds());
        forecast.setSlp(dto.getSlp());
        forecast.setPres(dto.getPres());
        forecast.setUv(dto.getUv());
        forecast.setVis(dto.getVis());
        forecast.setPop(dto.getPop());
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
