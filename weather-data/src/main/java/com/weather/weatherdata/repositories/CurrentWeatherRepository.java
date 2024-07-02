package com.weather.weatherdata.repositories;

import com.sun.jdi.Location;
import com.weather.weatherdata.model.CurrentWeather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CurrentWeatherRepository extends JpaRepository<CurrentWeather,Long> {

   // boolean existsByObservationTimeAndCityName(String observationTime, String cityName);
   //boolean existsByLocation_CityNameAndObservationTime(String cityName, String observationTime);

    CurrentWeather findByObservationTimeAndCityName(String observationTime, String cityName);

    Optional<CurrentWeather> findFirstByCityNameOrderByIdDesc(String cityName);

    void deleteById(long id);
}
