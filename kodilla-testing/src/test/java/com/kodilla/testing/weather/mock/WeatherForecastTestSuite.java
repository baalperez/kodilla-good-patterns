package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    public void before() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszów", 25.6);
        temperaturesMap.put("Kraków", 25.4);
        temperaturesMap.put("Warszawa", 26.8);
        temperaturesMap.put("Poznań", 25.0);
        temperaturesMap.put("Gdańsk", 23.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test
    void testWeatherForecastWithMock() {
        //Given
        before();
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testAverageTemperature() {
        //Given
        before();
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double expectedResult = weatherForecast.averageTemperature();

        //Then
        Assertions.assertEquals(25.18, expectedResult);
    }

    @Test
    void testMedianTemperature() {
        //Given
        before();
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double expectedResult = weatherForecast.medianTemperature();

        //Then
        Assertions.assertEquals(25.4, expectedResult);
    }
}
