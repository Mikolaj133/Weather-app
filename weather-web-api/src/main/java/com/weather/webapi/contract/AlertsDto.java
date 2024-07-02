package com.weather.webapi.contract;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class AlertsDto {
    private String description;
    private List<String> regions;
    private String title;


}
