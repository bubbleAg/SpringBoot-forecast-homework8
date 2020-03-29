package com.koro.forecast.service;

import com.koro.forecast.model.WeatherFromAPI;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    static final String BASE_URL = "https://www.metaweather.com/";
    static final Long CITY_ID = 523920L;

    public WeatherService() {
    }

    private WeatherFromAPI getWeather() {
        RestTemplate restTemplate = new RestTemplate();
        WeatherFromAPI weather = new WeatherFromAPI();
        String url = BASE_URL.concat("api/location/").concat(CITY_ID.toString());
        weather =restTemplate.getForObject(url, WeatherFromAPI.class);
        return weather;
    }
}
