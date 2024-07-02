package com.weather.weatherdata.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CurrentWeather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Location location;
    private int humidity;
    private String windDirection;
    private double windSpeed;   // unit m/s
    private double temperature; // in celsius
    private double apparentTemperature;
    private int cloudCover;  // cloud cover

    private String dateTime;
    private int pressure;    // pressure in mb unit
    private String sunrise;
    private String sunset;
    private double airQualityIndex;
    private double precipitationInLastHour;
    private double snowFallInLastHour;
    private String observationTime;
    private String cityName;
}