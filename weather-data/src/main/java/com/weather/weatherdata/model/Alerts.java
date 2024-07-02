package com.weather.weatherdata.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Alerts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Location location;
    private String title;
    private String description;
    private String severity;
    private String effectiveUtc;
    private String effectiveLocal;
    private String expiresUtc;
    private String expiresLocal;
    private String uri;
    private String cityName;
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
}
