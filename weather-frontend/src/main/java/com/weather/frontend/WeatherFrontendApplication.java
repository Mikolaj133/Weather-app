package com.weather.frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.weather.webapi"})
public class WeatherFrontendApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherFrontendApplication.class, args);
    }

}
