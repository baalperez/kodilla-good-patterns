package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public Double averageTemperature() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue());
        }
        double sum = 0;
        for (Double temperatureValue : temperatures.getTemperatures().values()) {
            sum += temperatureValue;
        }
        double average = sum / resultMap.size();
        return average;
    }

    public double medianTemperature() {
        double median;
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue());
        }
        List<Double> temp = new ArrayList<>();
        for (Double temperatureValue : temperatures.getTemperatures().values()) {
            temp.add(temperatureValue);
        }
        Collections.sort(temp);
        if (resultMap.size() % 2 != 0) {
            median = temp.get(temp.size() / 2);
        } else {
            double average = temp.get(temp.size() / 2) + temp.get(temp.size() / 2 - 1);
            median = average / 2;
        }
        return median;
    }
}