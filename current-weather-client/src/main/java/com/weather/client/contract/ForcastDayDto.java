package com.weather.client.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ForcastDayDto {

    @JsonProperty("city_name")
    private String cityName;
    @JsonProperty("state_code")
    private String stateCode;
    @JsonProperty("country_code")
    private String countryCode;
    private double lat;
    private double lon;
    private String timezone;
    private List<ForecastDto> data;
    private LocationDto location;
    @Override
    public String toString() {
        return "ForcastDayDto{" +
              //  "cityName='" + cityName + '\'' +
                ", stateCode='" + stateCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", timezone='" + timezone + '\'' +
                ", data=" + data +
                '}';
    }
}
