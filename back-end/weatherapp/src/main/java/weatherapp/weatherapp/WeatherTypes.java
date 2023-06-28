package weatherapp.weatherapp;

import org.springframework.stereotype.Component;

@Component
public class WeatherTypes implements weather {
    @Override
    public String getSunnyWeather() {
        return "The Weather is Sunny!";
    }

    @Override
    public String getClodyWeather() {

        return "The Weather is Cloudy!";
    }
}
