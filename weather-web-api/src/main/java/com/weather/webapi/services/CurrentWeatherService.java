package com.weather.webapi.services;
import com.weather.weatherdata.repositories.ICatalogData;
import com.weather.webapi.contract.AlertsDto;
import com.weather.webapi.contract.CurrentWeatherDto;
import com.weather.webapi.mappers.Mappers;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrentWeatherService implements ICurrentWeatherService{


    private final ICatalogData database;
    private final Mappers mappers;
    @Override
    public CurrentWeatherDto getCurrentWeather(String cityName) {
        var entity = database.getCurrentWeather().findFirstByCityNameOrderByIdDesc(cityName).orElse(null);
        if(entity ==  null) {
            return new CurrentWeatherDto();
        }
        return mappers.getCurrentWeatherToDtoMapper().map(entity);
    }
    @Override
    public void deleteCurrentWeather(long id) {
        database.getCurrentWeather().deleteById(id);
    }
    @Override
    public AlertsDto getAlerts(String cityName) {
        var entity = database.getAlerts().findByCityName(cityName).orElse(null);
        if(entity == null) {
            return null;
        }
        return mappers.getAlertsToDtoMapper().map(entity);
    }
    @Override
    public void deleteAlerts(long id ) {
        database.getAlerts().deleteById(id);
    }

}
