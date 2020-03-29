package com.koro.forecast.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsolidatedWeatherFromAPI {

    @JsonProperty("weather_state_name")
    private String weatherStateName;
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
        return "ConsolidatedWeatherFromAPI{" +
                "weatherStateName='" + weatherStateName + '\'' +
                ", theTemp=" + theTemp +
                '}';
    }
}
