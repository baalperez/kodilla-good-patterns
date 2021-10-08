package zadanie13_5;

import java.util.*;

public class Connection {

    private final Set<Airport> airportList = new HashSet<>();

    public Connection() {
        airportList.add(new Airport("KATOWICE", "WARSAW"));
        airportList.add(new Airport("KATOWICE", "GDANSK"));
        airportList.add(new Airport("KATOWICE", "POZNAN"));
        airportList.add(new Airport("KATOWICE", "BARCELONA"));
        airportList.add(new Airport("KATOWICE", "MADRID"));
        airportList.add(new Airport("KATOWICE", "ROME"));
        airportList.add(new Airport("KATOWICE", "MILAN"));
        airportList.add(new Airport("WARSAW", "MILAN"));
        airportList.add(new Airport("WARSAW", "TORINO"));
        airportList.add(new Airport("WARSAW", "ROME"));
        airportList.add(new Airport("WARSAW", "TOKYO"));
        airportList.add(new Airport("WARSAW", "BARCELONA"));
        airportList.add(new Airport("WARSAW", "MADRID"));
        airportList.add(new Airport("WARSAW", "PARIS"));
        airportList.add(new Airport("WARSAW", "FRANKFURT"));
        airportList.add(new Airport("WARSAW", "ROME"));
        airportList.add(new Airport("WARSAW", "KATOWICE"));
        airportList.add(new Airport("WARSAW", "GDANSK"));
        airportList.add(new Airport("WARSAW", "POZNAN"));
        airportList.add(new Airport("GDANSK", "KATOWICE"));
        airportList.add(new Airport("GDANSK", "POZNAN"));
        airportList.add(new Airport("GDANSK", "WARSAW"));
        airportList.add(new Airport("POZNAN", "WARSAW"));
        airportList.add(new Airport("POZNAN", "KATOWICE"));
        airportList.add(new Airport("POZNAN", "GDANSK"));
        airportList.add(new Airport("MADRID", "BARCELONA"));
        airportList.add(new Airport("MADRID", "WARSAW"));
        airportList.add(new Airport("MADRID", "KATOWICE"));
        airportList.add(new Airport("MADRID", "ROME"));
        airportList.add(new Airport("MADRID", "PARIS"));
        airportList.add(new Airport("MADRID", "TOKYO"));
        airportList.add(new Airport("BARCELONA", "MADRID"));
        airportList.add(new Airport("BARCELONA", "WARSAW"));
        airportList.add(new Airport("BARCELONA", "KATOWICE"));
        airportList.add(new Airport("BARCELONA", "FRANKFURT"));
        airportList.add(new Airport("ROME", "WARSAW"));
        airportList.add(new Airport("ROME", "MADRID"));
        airportList.add(new Airport("ROME", "PARIS"));
        airportList.add(new Airport("ROME", "FRANKFURT"));
        airportList.add(new Airport("ROME", "KATOWICE"));
        airportList.add(new Airport("FRANKFURT", "ROME"));
        airportList.add(new Airport("FRANKFURT", "WARSAW"));
        airportList.add(new Airport("FRANKFURT", "MADRID"));
        airportList.add(new Airport("FRANKFURT", "PARIS"));
        airportList.add(new Airport("FRANKFURT", "MILAN"));
        airportList.add(new Airport("FRANKFURT", "TORINO"));
        airportList.add(new Airport("TORINO", "MILAN"));
        airportList.add(new Airport("TORINO", "ROME"));
        airportList.add(new Airport("TORINO", "FRANKFURT"));
        airportList.add(new Airport("TORINO", "PARIS"));
        airportList.add(new Airport("PARIS", "ROME"));
        airportList.add(new Airport("PARIS", "MADRID"));
        airportList.add(new Airport("PARIS", "WARSAW"));
        airportList.add(new Airport("PARIS", "TOKYO"));
        airportList.add(new Airport("PARIS", "FRANKFURT"));
    }

    public Set<Airport> getAirportList() {
        return airportList;
    }
}

