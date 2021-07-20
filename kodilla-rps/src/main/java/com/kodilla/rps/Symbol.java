package com.kodilla.rps;

public enum Symbol {

    ROCK("1"),
    PAPER("2"),
    SCISSORS("3"),
    ;

    private String number;

    Symbol(String  number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
