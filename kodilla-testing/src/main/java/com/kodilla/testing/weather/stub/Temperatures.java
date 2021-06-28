package com.kodilla.testing.weather.stub;

import java.util.Map;

public interface Temperatures {

    //String - key (City), Double - value of temperature in Celsius degrees
    Map<String, Double> getTemperatures();
}
