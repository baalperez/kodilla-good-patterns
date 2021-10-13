package com.kodilla.patterns.enums.hotel;

public class HotelApp {

    public static void main(String[] args) {
/*        System.out.println("Accomodation prices:");
        System.out.println("1. Single Bed rooms");
        System.out.println("   - low season: " + PriceList.getSingleBedPrice("LOW"));
        System.out.println("   - high season: " + PriceList.getSingleBedPrice("HIGH"));
        System.out.println("   - holiday season: " + PriceList.getSingleBedPrice("HOLIDAY"));
        System.out.println("2. Double Bed rooms");
        System.out.println("   - low season: " + PriceList.getDoubleBedPrice("LOW"));
        System.out.println("   - high season: " + PriceList.getDoubleBedPrice("HIGH"));
        System.out.println("   - holiday season: " + PriceList.getDoubleBedPrice("HOLIDAY"));
 */
 /*       System.out.println("Accomodation prices:");
        System.out.println("1. Single Bed rooms");
        System.out.println("   - low season: " + PriceList.getSingleBedPrice(Season.LOW));
        System.out.println("   - high season: " + PriceList.getSingleBedPrice(Season.HIGH));
        System.out.println("   - holiday season: " + PriceList.getSingleBedPrice(Season.HOLIDAY));
        System.out.println("2. Double Bed rooms");
        System.out.println("   - low season: " + PriceList.getDoubleBedPrice(Season.LOW));
        System.out.println("   - high season: " + PriceList.getDoubleBedPrice(Season.HIGH));
        System.out.println("   - holiday season: " + PriceList.getDoubleBedPrice(Season.HOLIDAY));

        Season season = Season.HOLIDAY;

        System.out.println(season);
  */
        System.out.println("Accommodation prices:");
        System.out.println("1. Single Bed rooms");
        System.out.println("   - low season: " + Season.LOW.getSingleBedPrice());
        System.out.println("   - high season: " + Season.HIGH.getSingleBedPrice());
        System.out.println("   - holiday season: " + Season.HOLIDAY.getSingleBedPrice());
        System.out.println("2. Double Bed rooms");
        System.out.println("   - low season: " + Season.LOW.getDoubleBedPrice());
        System.out.println("   - high season: " + Season.HIGH.getDoubleBedPrice());
        System.out.println("   - holiday season: " + Season.HOLIDAY.getDoubleBedPrice());

        Season season = Season.HOLIDAY;

        System.out.println(season);
    }
}
