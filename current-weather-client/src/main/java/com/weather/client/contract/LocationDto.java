package com.weather.client.contract;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocationDto {
    @JsonProperty("city_name")
    private String cityName;
    @JsonProperty("country_code")
    private String countryCode;
    private double lat;
    private double lon;
    @JsonProperty("state_code")
    private String stateCode;
    private String timezone;

}
