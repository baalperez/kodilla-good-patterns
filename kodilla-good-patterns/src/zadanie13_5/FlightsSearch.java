package zadanie13_5;

import java.util.*;
import java.util.stream.Collectors;

public class FlightsSearch {

    Connection connection = new Connection();

    public void flightFromTo(String start, String end) {
        boolean isExist = true;

        long quantity = connection.getAirportList().stream()
                .filter(airport -> start.equals(airport.getDeparture()) && end.equals(airport.getArrival()))
                .count();
        if (quantity != 0) {
            System.out.println("There is a direct flight from " + start.toUpperCase() + " to " + end.toUpperCase());
            isExist = false;
        }

        if (isExist) {
            System.out.println("Sorry. The direct flight from " + start.toUpperCase() + " to " + end.toUpperCase() + " does not exist.");
            System.out.println("Searching for connecting flights...");
            if (!getFlights(start, end).isEmpty()) {
                System.out.println(getFlights(start, end));
            } else {
                System.out.println("Sorry. Flight not found.");
            }
        }
    }

    public Set<Airport> flightFrom(String city) {
        Set<Airport> flight;
        flight = connection.getAirportList().stream()
                .filter(airport -> city.equals(airport.getDeparture()))
                .collect(Collectors.toSet());
        return flight;
    }

    public Set<Airport> flightTo(String city) {
        Set<Airport> flight;
        flight = connection.getAirportList().stream()
                .filter(airport -> city.equals(airport.getArrival()))
                .collect(Collectors.toSet());
        return flight;
    }

    public void showFlight(Set<Airport> flight) {
        if (flight.isEmpty()) {
            System.out.println("No connections.");
        }
        flight.forEach(Airport::flightInfo);
    }

    public void showFlightFrom(String city) {
        Set<Airport> flight = flightFrom(city);
        showFlight(flight);
    }

    public void showFlightTo(String city) {
        Set<Airport> flight = flightTo(city);
        showFlight(flight);
    }

    public Set<String> showAllAirports() {
        Set<String> cities = new HashSet<>();
        connection.getAirportList().stream()
                .map(airport -> cities.add(airport.getDeparture()))
                .collect(Collectors.toSet());
        connection.getAirportList().stream()
                .map(airport -> cities.add(airport.getArrival()))
                .collect(Collectors.toSet());
        return cities;
    }

    public Set<Journey> getFlights(String start, String end) {
        Set<Airport> starting = flightFrom(start);
        Set<Airport> ending = flightTo(end);
        Set<Journey> results = new HashSet<>();
        for (Airport first : starting) {
            for (Airport second : ending) {
                if (first.getArrival().equals(second.getDeparture())) {
                    results.add(new Journey(first, second));
                }
            }
        }
        return results;
    }
}


