package com.weather.client.contract;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CurrentWeatherResult {
    private int count;
    private List<CurrentWeatherDto> data;
}
