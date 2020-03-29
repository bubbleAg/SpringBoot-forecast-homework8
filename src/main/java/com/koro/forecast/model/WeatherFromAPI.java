package com.koro.forecast.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeatherFromAPI {

    @JsonProperty("consolidated_weather")
    private List<ConsolidatedWeatherFromAPI> consolidatedWeather = null;
    @JsonProperty("time")
    private String time;
    @JsonProperty("title")
    private String city;
    @JsonProperty("woeid")
    private Integer cityId;

    public Weather toWeather() {
        Weather weather = new Weather();
        weather.setTime(time);
        weather.setCity(city);
        weather.setCityId(cityId);
        ConsolidatedWeatherFromAPI actualData = consolidatedWeather.get(0);
        weather.setWeatherStateName(actualData.getWeatherStateName());
        weather.setTheTemp(actualData.getTheTemp());
        return weather;
    }

    @JsonProperty("consolidated_weather")
    public List<ConsolidatedWeatherFromAPI> getConsolidatedWeather() {
        return consolidatedWeather;
    }

    @JsonProperty("consolidated_weather")
    public void setConsolidatedWeather(List<ConsolidatedWeatherFromAPI> consolidatedWeather) {
        this.consolidatedWeather = consolidatedWeather;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("title")
    public String getCity() {
        return city;
    }

    @JsonProperty("title")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("woeid")
    public Integer getCityId() {
        return cityId;
    }

    @JsonProperty("woeid")
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
}
