package com.weather.weatherdata.repositories;

import com.weather.weatherdata.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

    @Query("SELECT l.cityName FROM Location l")
    List<String> getAllCityNames();

    Location findFirstByCityName(String cityName);



}
