package com.weather.webapi.controllers;


import com.weather.webapi.contract.ForcastDto;
import com.weather.webapi.services.IForecastService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("forecast")
public class ForecastController {
    private final IForecastService forecastService;
    @GetMapping("{cityName}")
    public ResponseEntity<List<ForcastDto>> getForecast(@PathVariable String cityName){
        var forecast = forecastService.getForecast(cityName);
        return ResponseEntity.ok(forecast);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteForecast(@PathVariable long id){
        forecastService.deleteForecast(id);
        return ResponseEntity.ok().build();
    }
}
