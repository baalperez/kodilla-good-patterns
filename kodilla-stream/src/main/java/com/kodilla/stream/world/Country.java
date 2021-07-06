package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String countryName;
    private final BigDecimal peopleQuanity;

    public Country(final String countryName, final BigDecimal peopleQuanity) {
        this.countryName = countryName;
        this.peopleQuanity = peopleQuanity;
    }

    public BigDecimal getPeopleQuanity() {
        return peopleQuanity;
    }
}
