package com.weather.webapi.services;


import com.weather.webapi.contract.ForcastDto;
import com.weather.webapi.contract.ForcastSummaryDto;

import java.util.List;

public interface IForecastService {
    List<ForcastDto> getForecast(String cityName);
    void deleteForecast(long id);




}
