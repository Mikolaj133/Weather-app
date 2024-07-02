package com.weather.webapi.services;

import com.weather.weatherdata.model.Forcast;
import com.weather.weatherdata.repositories.ICatalogData;
import com.weather.webapi.contract.ForcastDto;
import com.weather.webapi.contract.ForcastSummaryDto;
import com.weather.webapi.mappers.Mappers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ForecastService implements IForecastService{

    private final ICatalogData database;
    private final Mappers mappers;

    @Override
    public List<ForcastDto> getForecast(String cityName) {
        List<Forcast> entityList = database.getForecast().findAllByCityName(cityName);
        List<ForcastDto> mappedList = new ArrayList<>();
        for (Forcast entity : entityList) {
            if(entity == null) return null;
            mappedList.add(mappers.getForcastToDtoMapper().map(entity));
        }
        return mappedList;
    }

    @Override
    public void deleteForecast(long id) {
        database.getForecast().deleteById(id);
    }
}
