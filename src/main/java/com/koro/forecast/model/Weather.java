package com.koro.forecast.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String time;
    private String city;
    private Integer cityId;
    private String weatherStateName;
    private Double theTemp;

    public Weather() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getWeatherStateName() {
        return weatherStateName;
    }

    public void setWeatherStateName(String weatherStateName) {
        this.weatherStateName = weatherStateName;
    }

    public Double getTheTemp() {
        return theTemp;
    }

    public void setTheTemp(Double theTemp) {
        this.theTemp = theTemp;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", city='" + city + '\'' +
                ", cityId=" + cityId +
                ", weatherStateName='" + weatherStateName + '\'' +
                ", theTemp=" + theTemp +
                '}';
    }
}
