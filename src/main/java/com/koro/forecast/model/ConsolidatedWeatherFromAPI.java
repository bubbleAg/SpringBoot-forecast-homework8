package com.koro.forecast.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class ConsolidatedWeatherFromAPI {

    @JsonProperty("weather_state_name")
    private String weatherStateName;
    @JsonProperty("applicable_date")
    private LocalDate applicableDate;
    @JsonProperty("min_temp")
    private Double minTemp;
    @JsonProperty("max_temp")
    private Double maxTemp;
    @JsonProperty("the_temp")
    private Double theTemp;

    public ConsolidatedWeatherFromAPI() {
    }

    @JsonProperty("weather_state_name")
    public String getWeatherStateName() {
        return weatherStateName;
    }

    @JsonProperty("weather_state_name")
    public void setWeatherStateName(String weatherStateName) {
        this.weatherStateName = weatherStateName;
    }

    @JsonProperty("applicable_date")
    public LocalDate getApplicableDate() {
        return applicableDate;
    }

    @JsonProperty("applicable_date")
    public void setApplicableDate(LocalDate applicableDate) {
        this.applicableDate = applicableDate;
    }

    @JsonProperty("min_temp")
    public Double getMinTemp() {
        return minTemp;
    }

    @JsonProperty("min_temp")
    public void setMinTemp(Double minTemp) {
        this.minTemp = minTemp;
    }

    @JsonProperty("max_temp")
    public Double getMaxTemp() {
        return maxTemp;
    }

    @JsonProperty("max_temp")
    public void setMaxTemp(Double maxTemp) {
        this.maxTemp = maxTemp;
    }

    @JsonProperty("the_temp")
    public Double getTheTemp() {
        return theTemp;
    }

    @JsonProperty("the_temp")
    public void setTheTemp(Double theTemp) {
        this.theTemp = theTemp;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "weatherStateName='" + weatherStateName + '\'' +
                ", applicableDate=" + applicableDate +
                ", minTemp=" + minTemp +
                ", maxTemp=" + maxTemp +
                ", theTemp=" + theTemp +
                '}';
    }
}
