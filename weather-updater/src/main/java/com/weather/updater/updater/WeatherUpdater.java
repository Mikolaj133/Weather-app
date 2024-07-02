package com.weather.updater.updater;

import com.weather.client.IWeatherClient;
import com.weather.client.contract.AlertsDto;
import com.weather.client.contract.CurrentWeatherDto;
import com.weather.client.contract.ForcastDayDto;
import com.weather.client.contract.ForecastDto;
import com.weather.updater.LocationFileReader;
import com.weather.updater.mappers.ICatalogMappers;
import com.weather.weatherdata.model.Forcast;
import com.weather.weatherdata.model.Location;
import com.weather.weatherdata.repositories.ICatalogData;
import com.weather.weatherdata.repositories.LocationRepository;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@Getter
@Setter
public class WeatherUpdater implements IUpdate{
    private ICatalogMappers map;

    private ICatalogData database;

    private IWeatherClient client;

    public WeatherUpdater(ICatalogMappers map,
                          ICatalogData database, IWeatherClient client) {
        this.map = map;
        this.database = database;
        this.client = client;
    }
    @Override
    public void size(int size) {
        List<Location> locationList = LocationFileReader.getLocationValues(size);
        LocationRepository locationRepository = database.getLocations();
        for(var loc : locationList){
            Location existingLocation = locationRepository.findFirstByCityName(loc.getCityName());
            if(existingLocation==null){
                locationRepository.save(loc);
            }
        }
        List<String> cityNames = locationRepository.getAllCityNames();
        saveCurrentWeather(cityNames);
        saveForecastWeather(cityNames);
        saveAlerts(cityNames);
    }
    void saveCurrentWeather(List<String> cityNames){
        for(String cityName : cityNames){
            CurrentWeatherDto currentWeatherDto = client.getCurrentWeather(cityName);
            for(var weatherDto : currentWeatherDto.getData()){
                if(database.getCurrentWeather().findByObservationTimeAndCityName(weatherDto.getObservationTime(), weatherDto.getCityName()) == null){
                    var weather = map.forCurWeather().toEntity(weatherDto);
                    database.getCurrentWeather().save(weather);
                }
            }
        }
    }
    void saveForecastWeather(List<String> cityNames){
        for(String cityName : cityNames){
            ForecastDto forecastDto = client.getForcastWeather(cityName);
            for(var forcastDto : forecastDto.getData()){
                if(database.getForecast().findByDatetimeAndCityName(forcastDto.getDatetime(), forcastDto.getCityName()) == null){
                    var weather = map.forForcast().toEntity(forcastDto);
                    database.getForecast().save(weather);
                    var saveCityName = database.getForecast()
                            .findByDatetimeAndCityName(forcastDto.getDatetime(), forcastDto.getCityName());
                    if(saveCityName != null){
                        saveCityName.setCityName(cityName);
                        database.getForecast().save(saveCityName);
                    }
                }
            }
        }
    }
    void saveAlerts(List<String> cityNames){
        for(String cityName : cityNames){
            AlertsDto alertsDto = client.getAlerts(cityName);
            for(var alertDto : alertsDto.getAlertsData()){
                if(database.getAlerts().findByCityNameAndExpiresUtc(alertDto.getCityName(), alertDto.getExpiresUtc()) == null){
                    var alert = map.forAlerts().toEntity(alertDto);
                    database.getAlerts().save(alert);

                    var saveCityName = database.getAlerts().findByCityNameAndExpiresUtc(alertDto.getCityName(), alertDto.getExpiresUtc());
                    if(saveCityName != null){
                        saveCityName.setCityName(cityName);
                        database.getAlerts().save(saveCityName);
                    }
                }
            }
        }
    }
}