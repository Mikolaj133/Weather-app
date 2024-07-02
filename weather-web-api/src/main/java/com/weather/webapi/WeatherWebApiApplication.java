package com.weather.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
@SpringBootApplication(scanBasePackages = "com.weather")
public class WeatherWebApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherWebApiApplication.class, args);
    }

}
