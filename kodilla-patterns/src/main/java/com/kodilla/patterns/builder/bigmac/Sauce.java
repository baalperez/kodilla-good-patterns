package com.kodilla.patterns.builder.bigmac;

public class Sauce {

    public static final String STANDARD = "STANDARD";
    public static final String THOUSAND_ISLAND_DRESSING = "THOUSAND_ISLAND_DRESSING";
    public static final String BARBEQUE = "BARBEQUE";

    public Sauce(String typeOfSauce) {
        if (!(typeOfSauce.equals(STANDARD) || typeOfSauce.equals(THOUSAND_ISLAND_DRESSING) ||
        typeOfSauce.equals(BARBEQUE))) {
            throw new IllegalStateException("Sauce should be: standard, barbeque or thousand island dressing");
        }
    }
}
