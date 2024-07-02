package com.weather.frontend.Controllers;

import com.weather.webapi.contract.CurrentWeatherDto;
import com.weather.webapi.services.CurrentWeatherService;
import com.weather.webapi.services.ICurrentWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@Controller
public class FrontendController {
    private final ICurrentWeatherService currentWeatherService;


    @Autowired
    public FrontendController(ICurrentWeatherService currentWeatherService) {
        this.currentWeatherService = currentWeatherService;
    }

    @GetMapping("/")
    public String showHomePage(){
        return "firstPage";
    }

    @GetMapping("/currentWeather")
    public String getCurrentWeather(@RequestParam String cityName ,  Model model){
        CurrentWeatherDto currentWeather = currentWeatherService.getCurrentWeather(cityName);
        model.addAttribute("currentWeather" , currentWeather);
     //   return ResponseEntity.ok().build();
        return "currentWeather";
    }



//    @GetMapping("/currentWeather")
//    public String getCurrentWeather(@RequestParam String city, Model model) {
//        // Get current weather for the provided city
//        CurrentWeatherDto currentWeather = currentWeatherService.getCurrentWeather(city);
//
//        if (currentWeather != null) {
//            // If weather data is available, add it to the model to be displayed
//            model.addAttribute("currentWeather", currentWeather);
//        } else {
//            // If weather data is not available, handle it accordingly (e.g., show an error message)
//            model.addAttribute("errorMessage", "Weather data for " + city + " not found");
//        }
//
//        // Return the name of the HTML page to be rendered (e.g., currentWeather.html)
//        return "currentWeather";
//    }


}
