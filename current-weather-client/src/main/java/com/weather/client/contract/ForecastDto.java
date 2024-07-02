package com.weather.client.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ForecastDto extends ForcastDayDto{
    private double ts;
    @JsonProperty("timestamp_local")
    private String timestampLocal;
    @JsonProperty("timestamp_utc")
    private String timestampUtc;
    private String datetime;
    private double snow;
    @JsonProperty("snow_depth")
    private Double snowDepth;
    private double precip;
    private double temp;
    private double dewpt;
    @JsonProperty("max_temp")
    private double maxTemp;
    @JsonProperty("min_temp")
    private double minTemp;
    @JsonProperty("app_max_temp")
    private double appMaxTemp;
    @JsonProperty("app_min_temp")
    private double appMinTemp;
    private int rh;
    private int clouds;
    private WeatherDto weather;
    private double slp;
    private double pres;
    private double uv;
    @JsonProperty("max_dhi")
    private Double maxDhi;
    private double vis;
    private double pop;
    @JsonProperty("moon_phase")
    private double moonPhase;
    @JsonProperty("sunrise_ts")
    private int sunriseTs;
    @JsonProperty("sunset_ts")
    private int sunsetTs;
    @JsonProperty("moonrise_ts")
    private int moonriseTs;
    @JsonProperty("moonset_ts")
    private int moonsetTs;
    private String pod;
    @JsonProperty("wind_spd")
    private double windSpd;
    @JsonProperty("wind_dir")
    private int windDir;
    @JsonProperty("wind_cdir")
    private String windCdir;
    @JsonProperty("wind_cdir_full")
    private String windCdirFull;


    @Override
    public String toString() {
        return "ForecastDto{" +
                "ts=" + ts +
                ", timestampLocal='" + timestampLocal + '\'' +
                ", timestampUtc='" + timestampUtc + '\'' +
                ", datetime='" + datetime + '\'' +
                ", snow=" + snow +
                ", snowDepth=" + snowDepth +
                ", precip=" + precip +
                ", temp=" + temp +
                ", dewpt=" + dewpt +
                ", maxTemp=" + maxTemp +
                ", minTemp=" + minTemp +
                ", appMaxTemp=" + appMaxTemp +
                ", appMinTemp=" + appMinTemp +
                ", rh=" + rh +
                ", clouds=" + clouds +
                ", weather=" + weather +
                ", slp=" + slp +
                ", pres=" + pres +
                ", uv=" + uv +
                ", maxDhi=" + maxDhi +
                ", vis=" + vis +
                ", pop=" + pop +
                ", moonPhase=" + moonPhase +
                ", sunriseTs=" + sunriseTs +
                ", sunsetTs=" + sunsetTs +
                ", moonriseTs=" + moonriseTs +
                ", moonsetTs=" + moonsetTs +
                ", pod='" + pod + '\'' +
                ", windSpd=" + windSpd +
                ", windDir=" + windDir +
                ", windCdir='" + windCdir + '\'' +
                ", windCdirFull='" + windCdirFull + '\'' +

                '}';
    }
}
