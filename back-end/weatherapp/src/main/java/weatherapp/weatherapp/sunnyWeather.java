package weatherapp.weatherapp;

import org.springframework.stereotype.Component;

@Component
public class sunnyWeather implements weather {
    @Override
    public String getWeather() {
        return "The Weather is Sunny!";
    }
}
