package com.koro.forecast.service;

import com.koro.forecast.repository.WeatherRepository;
import com.koro.forecast.model.Weather;
import com.koro.forecast.model.WeatherFromAPI;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@EnableScheduling
public class WeatherService {

    static final String BASE_URL = "https://www.metaweather.com/";
    static final Long CITY_ID = 523920L;

    WeatherRepository weatherRepository;

    public WeatherService(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    private WeatherFromAPI getWeatherAPI() {
        RestTemplate restTemplate = new RestTemplate();
        String url = BASE_URL.concat("api/location/").concat(CITY_ID.toString());
        return restTemplate.getForObject(url, WeatherFromAPI.class);
    }

    @Scheduled(cron = "0 0 * ? * *")
    private void saveActualWeather() {
        Weather weather = getWeatherAPI().toWeather();
        weatherRepository.save(weather);
    }
}
