package com.weather.weatherdata.repositories;

import com.weather.weatherdata.model.Alerts;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AlertsRepository extends JpaRepository<Alerts,Long> {
    Optional<Alerts> findByCityName(String cityName);
    void deleteById(long id);
    Alerts findByCityNameAndExpiresUtc(String cityName, String expiresUtc);

}
