package com.kodilla.patterns.enums.hotel;

import java.math.BigDecimal;
import java.util.Map;

public class PriceList {

/*    private static Map<String, BigDecimal> singleBedPrice = Map.of(
            "LOW", new BigDecimal(250),
            "HIGH", new BigDecimal(320),
            "HOLIDAY", new BigDecimal(400)
    );

    private static Map<String, BigDecimal> doubleBedPrice = Map.of(
            "LOW", new BigDecimal(350),
            "HIGH", new BigDecimal(400),
            "HOLIDAY", new BigDecimal(500)
    );

    public static BigDecimal getSingleBedPrice(String season) {
        return singleBedPrice.get(season);
    }

    public static BigDecimal getDoubleBedPrice(String season) {
        return doubleBedPrice.get(season);
    }
 */

    private static Map<Season, BigDecimal> singleBedPrice = Map.of(
            Season.LOW, new BigDecimal(250),
            Season.HIGH, new BigDecimal(320),
            Season.HOLIDAY, new BigDecimal(400)
    );

    private static Map<Season, BigDecimal> doubleBedPrice = Map.of(
            Season.LOW, new BigDecimal(350),
            Season.HIGH, new BigDecimal(400),
            Season.HOLIDAY, new BigDecimal(500)
    );

    public static BigDecimal getSingleBedPrice(Season season) {
        return singleBedPrice.get(season);
    }

    public static BigDecimal getDoubleBedPrice(Season season) {
        return doubleBedPrice.get(season);
    }
}
