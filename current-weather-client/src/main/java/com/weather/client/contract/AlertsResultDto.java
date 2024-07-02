package com.weather.client.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AlertsResultDto {
    private String cityName;
    private String countryCode;
    private double lat;
    private double lon;
    private String stateCode;
    private String timezone;

    @JsonProperty("alerts")
    private List<AlertsDto> alertsData;

}
