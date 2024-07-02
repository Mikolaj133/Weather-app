package com.weather.client.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.parsing.Location;

import java.util.List;
@Getter
@Setter
public class CurrentWeatherDto extends CurrentWeatherResult{
    @JsonProperty("app_temp")
    private double apparentTemperature;

    @JsonProperty("aqi")
    private int airQualityIndex;

    @JsonProperty("city_name")
    private String cityName;

    @JsonProperty("clouds")
    private int clouds;

    @JsonProperty("country_code")
    private String countryCode;

    @JsonProperty("datetime")
    private String datetime;

    @JsonProperty("dewpt")
    private double dewpoint;

    @JsonProperty("dhi")
    private int directHorizontalIrradiance;

    @JsonProperty("dni")
    private int directNormalIrradiance;

    @JsonProperty("elev_angle")
    private double elevationAngle;

    @JsonProperty("ghi")
    private int globalHorizontalIrradiance;

    @JsonProperty("gust")
    private double gust;

    @JsonProperty("h_angle")
    private int hourAngle;

    @JsonProperty("lat")
    private double latitude;

    @JsonProperty("lon")
    private double longitude;

    @JsonProperty("ob_time")
    private String observationTime;

    @JsonProperty("pod")
    private String partOfDay;

    @JsonProperty("precip")
    private double precipitation;

    @JsonProperty("pres")
    private int pressure;

    @JsonProperty("rh")
    private int humidity;

    @JsonProperty("slp")
    private int meanSeaLevelPressure;

    @JsonProperty("snow")
    private double snowfall;

    @JsonProperty("solar_rad")
    private int solarRadiation;

    @JsonProperty("sources")
    private List<String> sources;

    @JsonProperty("state_code")
    private String stateCode;

    @JsonProperty("station")
    private String station;

    @JsonProperty("sunrise")
    private String sunrise;

    @JsonProperty("sunset")
    private String sunset;

    @JsonProperty("temp")
    private double temperature;

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("ts")
    private long timestamp;

    @JsonProperty("uv")
    private int uvIndex;

    @JsonProperty("vis")
    private int visibility;

//    @JsonProperty("weather")
//    private WeatherDetails weatherDetails;

    @JsonProperty("wind_cdir")
    private String windCardinalDirection;

    @JsonProperty("wind_cdir_full")
    private String windDirectionFull;

    @JsonProperty("wind_dir")
    private int windDirection;

    @JsonProperty("wind_spd")
    private double windSpeed;

    private Location location;

    @Override
    public String toString() {
        return "Data{" +
                "apparentTemperature=" + apparentTemperature +
                ", airQualityIndex=" + airQualityIndex +
                    ", cityName='" + cityName + '\'' +
                ", clouds=" + clouds +
                ", countryCode='" + countryCode + '\'' +
                ", datetime='" + datetime + '\'' +
                ", dewpoint=" + dewpoint +
                ", directHorizontalIrradiance=" + directHorizontalIrradiance +
                ", directNormalIrradiance=" + directNormalIrradiance +
                ", elevationAngle=" + elevationAngle +
                ", globalHorizontalIrradiance=" + globalHorizontalIrradiance +
                ", gust=" + gust +
                ", hourAngle=" + hourAngle +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", observationTime='" + observationTime + '\'' +
                ", partOfDay='" + partOfDay + '\'' +
                ", precipitation=" + precipitation +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", meanSeaLevelPressure=" + meanSeaLevelPressure +
                ", snowfall=" + snowfall +
                ", solarRadiation=" + solarRadiation +
                ", sources=" + sources +
                ", stateCode='" + stateCode + '\'' +
                ", station='" + station + '\'' +
                ", sunrise='" + sunrise + '\'' +
                ", sunset='" + sunset + '\'' +
                ", temperature=" + temperature +
                ", timezone='" + timezone + '\'' +
                ", timestamp=" + timestamp +
                ", uvIndex=" + uvIndex +
                ", visibility=" + visibility +
               // ", weatherDetails=" + weatherDetails +
                ", windCardinalDirection='" + windCardinalDirection + '\'' +
                ", windDirectionFull='" + windDirectionFull + '\'' +
                ", windDirection=" + windDirection +
                ", windSpeed=" + windSpeed +
                '}';
    }
}

//    @Getter
//    @Setter
//    public  class WeatherDetails {
//        private String icon;
//        private String description;
//        private int code;
//    }

