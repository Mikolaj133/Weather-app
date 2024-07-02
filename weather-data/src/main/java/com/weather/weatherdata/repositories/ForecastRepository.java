package com.weather.weatherdata.repositories;

import com.weather.weatherdata.model.Forcast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ForecastRepository extends JpaRepository<Forcast,Long> {

    Forcast findByDatetimeAndCityName(String datetime, String cityName);

    void deleteById(long id);
    Optional<Forcast> findFirstByCityName(String cityName);

    Forcast findFirstByCityNameOrderByIdDesc(String cityName);

    List<Forcast> findAllByCityName(String cityName);



}
