package com.weather.weatherdata.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Location {

  public Location(int cityId, String cityName, String stateCode, String countryCode, double lat, double lon) {
    this.cityId = cityId;
    this.cityName = cityName;
    this.stateCode = stateCode;
    this.countryCode = countryCode;
    this.lat = lat;
    this.lon = lon;
  }
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;


  @OneToMany(mappedBy = "location")
  private List<CurrentWeather> currentWeathers;

  @OneToMany(mappedBy = "location")
  private List<Forcast> forcasts;

  @OneToOne(mappedBy = "location")
  private Alerts alerts;

    private int cityId;
    private String cityName;
    private String stateCode;
    private String countryCode;
    private double lat;
    private double lon;



}
