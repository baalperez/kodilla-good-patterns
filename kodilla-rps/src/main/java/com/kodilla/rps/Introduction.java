package com.kodilla.rps;

import java.io.IOException;

public class Introduction {

    public void intro() {
        System.out.println();
        System.out.println("////////////////////////////////////////////////////////////");
        System.out.println("//           WELCOME TO GAME: ROCK/PAPER/SCISSORS         //");
        System.out.println("////////////////////////////////////////////////////////////");
    }

    public char choice() throws IOException {
        char choice, ignore;
        do {
            System.out.println("Choose an option: 1 - Basic Version, 2 - Extended Version");
            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choice != '1' && choice != '2');
        return choice;
    }

    public void gameOption(char choice) {
        switch (choice) {
            case '1' -> {
                basicRules();
                basicVersion();
            }
            case '2' -> extendedVersion();
        }
    }

    public void basicRules() {
        System.out.println();
        System.out.println(">>       RULES       <<");
        System.out.println("Rock wins against scissors");
        System.out.println("Paper wins against Rock");
        System.out.println("Scissors win against Paper");
    }

    public void basicVersion() {
        System.out.println();
        System.out.println(">>   CONTROL KEYS    <<");
        System.out.println(" 1 - Rock");
        System.out.println(" 2 - Paper");
        System.out.println(" 3 - Scissors");
        System.out.println(" x - Quit game");
        System.out.println(" n - New game");
    }

    public void extendedVersion() {
        System.out.println("XXXXXXXXX");

    }
}
