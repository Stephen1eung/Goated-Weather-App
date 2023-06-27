package weatherapp.weatherapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {

    // expose "/" to return a string

    @GetMapping("/")
    public String printString() {
        return "Welcome to the weather app";
    }

}
