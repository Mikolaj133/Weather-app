package com.weather.updater.mappers;

import com.weather.client.contract.AlertsDto;
import com.weather.client.contract.CurrentWeatherDto;
import com.weather.client.contract.ForecastDto;
import com.weather.weatherdata.model.Alerts;
import com.weather.weatherdata.model.CurrentWeather;
import com.weather.weatherdata.model.Forcast;
import com.weather.weatherdata.model.Location;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;



@Component
public class EntityMapper implements ICatalogMappers{

    private final IMapEntities<AlertsDto, Alerts> forAlerts;
    private final IMapEntities<CurrentWeatherDto, CurrentWeather> forWeather;
    private final IMapEntities<ForecastDto, Forcast> forForcast;


    public EntityMapper(IMapEntities<AlertsDto, Alerts> forAlerts, IMapEntities<CurrentWeatherDto, CurrentWeather> forWeather, IMapEntities<ForecastDto, Forcast> forForcast) {
        this.forAlerts = forAlerts;
        this.forWeather = forWeather;
        this.forForcast = forForcast;
    }

    @Override
    public IMapEntities<AlertsDto, Alerts> forAlerts() {
        return forAlerts;
    }

    @Override
    public IMapEntities<CurrentWeatherDto, CurrentWeather> forCurWeather() {
        return forWeather;
    }

    @Override
    public IMapEntities<ForecastDto, Forcast> forForcast() {
        return forForcast;
    }
}
