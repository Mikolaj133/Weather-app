package com.weather.webapi.controllers;


import com.weather.webapi.services.ICurrentWeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@RequestMapping("currentWeather")
@RequiredArgsConstructor
public class CurrentWeatherController {

    private final ICurrentWeatherService currentWeatherService;

    @GetMapping("/{cityName}")
    public ResponseEntity<?> getCurrentWeather(@PathVariable("cityName") String cityName){
        var currentWeather = currentWeatherService.getCurrentWeather(cityName);
        if(currentWeather == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(currentWeather);
    }

    @GetMapping("/alerts/{cityName}")
    public ResponseEntity getAlerts(@PathVariable("cityName") String cityName){
        var alerts = currentWeatherService.getAlerts(cityName);
        return ResponseEntity.ok(alerts);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteCurrentWeather(@PathVariable("id") long id){
        currentWeatherService.deleteCurrentWeather(id);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/alerts/{id}")
    public ResponseEntity deleteAlerts(@PathVariable("id") long id){
        currentWeatherService.deleteAlerts(id);
        return ResponseEntity.ok().build();
    }
}
