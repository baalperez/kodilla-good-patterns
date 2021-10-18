package com.kodilla.patterns.builder.bigmac;

import java.util.*;

public class Bigmac {

    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private final List<String> ingredients = new ArrayList<>();

        public Bigmac.BigmacBuilder bun(String bun) {
            new Bun(bun);
            this.bun = bun;
            return this;
        }

        public Bigmac.BigmacBuilder burgers(int burgers) {
            if (burgers <= 0) {
                throw new IllegalStateException("Bigmac cannot be without beef chops");
            } else if (burgers > 2) {
                throw new IllegalStateException("Too many beef chops");
            } else {
                this.burgers = burgers;
            }
            return this;
        }

        public Bigmac.BigmacBuilder sauce(String sauce) {
            new Sauce(sauce);
            this.sauce = sauce;
            return this;
        }

        public Bigmac.BigmacBuilder ingredient(String ingredient) {
            new Ingredients(ingredient);
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final String bun, final int burgers, final String sauce,
                   final List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun=" + bun +
                ", burgers=" + burgers +
                ", sauce=" + sauce +
                ", ingredients=" + ingredients +
                '}';
    }
}
