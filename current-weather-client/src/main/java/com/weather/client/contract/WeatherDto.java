package com.weather.client.contract;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherDto {
    private String icon;
    private int code;
    private String description;
}
