package weatherapp.weatherapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import weatherapp.weatherapp.weather;

@RestController
public class restController {

    private weather myWeather;
    // expose "/" to return a string

    // COnstructor for the weather object
    @Autowired
    public restController(weather theWeather) {
        myWeather = theWeather;
    }

    @GetMapping("/getWeather")
    public String getWeather() {
        return myWeather.getWeather();
    }

    @GetMapping("/")
    public String printString() {
        return "Welcome to the weather app";
    }

    @GetMapping("/main")
    public String mainPage() {
        return "This is going to be the main page API";
    }

}
