package com.kodilla.patterns.builder.bigmac;

public class Bun {

    public static final String SESAME = "SESAME";
    public static final String NO_SESAME = "NO_SESAME";

    public Bun(String typeOfBun) {
        if (!(typeOfBun.equals(SESAME) || typeOfBun.equals(NO_SESAME))) {
            throw new IllegalStateException("Bun should be with sesame or without sesame");
        }
    }
}
