package zadanie13_5;

import java.util.Objects;

public class Airport {

    private final String departure;
    private final String arrival;

    public Airport(final String departure, final String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public void flightInfo() {
        System.out.println("Flight from " + departure + " to " + arrival);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        if (!Objects.equals(departure, airport.departure)) return false;
        return Objects.equals(arrival, airport.arrival);
    }

    @Override
    public int hashCode() {
        int result = departure != null ? departure.hashCode() : 0;
        result = 31 * result + (arrival != null ? arrival.hashCode() : 0);
        return result;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }
}


