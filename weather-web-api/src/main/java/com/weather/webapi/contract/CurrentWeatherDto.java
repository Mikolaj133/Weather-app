package com.weather.webapi.contract;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrentWeatherDto {
    private double apparentTemperature;
    private double airQualityIndex;
    private int cloudCover;
    private String datetime;
    private int pressure;
    private double snowFall;
    private String sunrise;
    private String sunset;
    private double temperature;
    private String windCardinalDirection;
    private String windDirectionFull;
    private double windSpeed;
    private String cityName;

}
