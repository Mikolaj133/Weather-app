package com.weather.client;

import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;
//@Component
public interface IWeatherClientSettings {

    String getApiKey();

    String getBaseUrl();

    String getApiVersion();


    default UriComponentsBuilder getUrlBuilder(){
        return UriComponentsBuilder
                .newInstance()
                .scheme("https")
                .host(getBaseUrl())
                .pathSegment(getApiVersion()+ "")
                .queryParam("key",getApiKey());

    }
}
