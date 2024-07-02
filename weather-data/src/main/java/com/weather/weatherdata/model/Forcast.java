package com.weather.weatherdata.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Forcast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Location location;
    private double ts;


    private String datetime;
    private double snow;

    private Double snowDepth;

    private double precip;
    private double temp;
    private double dewpt;

    private double maxTemp;

    private double minTemp;

    private double appMaxTemp;

    private double appMinTemp;

    private int rh;
    private int clouds;
    private double slp;
    private double pres;
    private double uv;
   // private Double maxDhi;
    private double vis;
    private double pop;
    private double moonPhase;
    private int sunriseTs;
    private int sunsetTs;
    private int moonriseTs;
    private int moonsetTs;
    //private String pod;
    private double windSpd;
    private int windDir;
    private String windCdir;
    private String windCdirFull;
    private String cityName;
}
