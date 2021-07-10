package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFilght(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airportMap = new HashMap<>();
        airportMap.put("Milano", true);
        airportMap.put("Tokyo", true);
        airportMap.put("Paris", true);
        airportMap.put("Warsaw", true);
        airportMap.put("Madrid", true);
        airportMap.put("Oslo", true);
        airportMap.put("Barcelona", true);
        airportMap.put("Katowice", true);
        airportMap.put("Rome", true);
        airportMap.put("Dortmund", true);

        if (airportMap.containsKey(flight.getArrivalAirport()) &&
                airportMap.containsKey(flight.getDepartureAirport())) {
            System.out.println("Yes. You can fly from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("One of the airport does not exist");
        }
    }

    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFilght(new Flight("Rome", "Tokyo"));
        } catch (RouteNotFoundException e) {
            System.out.println("Sorry, something went wrong! ");
        }
    }
}
