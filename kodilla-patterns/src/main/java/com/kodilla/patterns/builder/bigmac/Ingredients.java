package com.kodilla.patterns.builder.bigmac;

public class Ingredients {

    public static final String LETTUCE = "LETTUCE";
    public static final String ONION = "ONION";
    public static final String BECON = "BECON";
    public static final String CUCUMBER = "CUCUMBER";
    public static final String CHILLI = "CHILLI";
    public static final String MUSHROOMS = "MUSHROOMS";
    public static final String PRAWNS = "PRAWNS";
    public static final String CHEESE = "CHEESE";

    public Ingredients(String ingredient) {
        if (!(ingredient.equals(LETTUCE) || ingredient.equals(ONION) || ingredient.equals(BECON) ||
        ingredient.equals(CUCUMBER) || ingredient.equals(CHILLI) || ingredient.equals(MUSHROOMS) ||
        ingredient.equals(PRAWNS) || ingredient.equals(CHEESE))) {
            throw new IllegalStateException("Wrong ingredient");
        }
    }
}
