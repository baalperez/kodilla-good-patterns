package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class World {

    private final Map<Continent, List<Country>> continentsWithCountries = new HashMap<>();

    public void putEntryToMap(Continent continent, List<Country> theList) {
        continentsWithCountries.put(continent, theList);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal finalResult = continentsWithCountries.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream()
                        .map(Country::getPeopleQuanity))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return finalResult;
    }

}
