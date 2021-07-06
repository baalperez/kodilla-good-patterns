package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("38500000"));
        Country germany = new Country("Germany", new BigDecimal("85000000"));
        Country spain = new Country("Spain", new BigDecimal("65000000"));
        Country france = new Country("France", new BigDecimal("72000000"));
        Country russia = new Country("Russia", new BigDecimal("132000000"));
        Country china = new Country("China", new BigDecimal("1200000000"));
        List<Country> europeanCountries = new ArrayList<>();
        List<Country> asianCountries = new ArrayList<>();
        europeanCountries.add(poland);
        europeanCountries.add(germany);
        europeanCountries.add(spain);
        europeanCountries.add(france);
        asianCountries.add(russia);
        asianCountries.add(china);
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("asia");
        World world = new World();
        world.putEntryToMap(europe, europeanCountries);
        world.putEntryToMap(asia, asianCountries);

        // When
        BigDecimal ressult = world.getPeopleQuantity();

        //Then
        BigDecimal xxx = new BigDecimal("1592500000");
        assertEquals(xxx, ressult);
    }
}
