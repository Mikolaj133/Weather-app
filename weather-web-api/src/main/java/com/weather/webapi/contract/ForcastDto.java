package com.weather.webapi.contract;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ForcastDto extends ForcastSummaryDto{

  private String datetime;
  private double snow;

  private Double snowDepth;

  private double precip;
  private double temp;
  private double maxTemp;
  private double minTemp;
  private double appMaxTemp;
  private double appMinTemp;
  private int clouds;
  private double pres;
  private double uv;
  private double moonPhase;
  private int sunriseTs;
  private int sunsetTs;
  private int moonriseTs;
  private int moonsetTs;
  private double windSpd;
  private int windDir;
  private String windCdir;
  private String windCdirFull;
  private String cityName;

}
