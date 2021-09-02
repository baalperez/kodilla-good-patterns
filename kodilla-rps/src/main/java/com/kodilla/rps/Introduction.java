
package com.kodilla.rps;

import java.util.Scanner;

public class Introduction {

    Scanner scanner = new Scanner(System.in);


    public void intro() {
        System.out.println();
        System.out.println("////////////////////////////////////////////////////////////");
        System.out.println("//           WELCOME TO GAME: ROCK/PAPER/SCISSORS         //");
        System.out.println("////////////////////////////////////////////////////////////");
    }

    public int choice() {
        int choice = 0;
        do {
            try {
                System.out.println("Choose an option: 1 - Basic Version, 2 - Extended Version");
                choice = scanner.nextInt();
                if (choice != 1 && choice != 2) {
                    System.out.println("Try again");
                }
            } catch (Exception e) {
                System.out.println("Bad choice");
                scanner.next();
            }
        } while (choice != 1 && choice != 2);
        return choice;
    }

    public void gameOption(int choice) {
        switch (choice) {
            case 1 -> {
                basicRules();
                basicVersion();
            }
            case 2 -> extendedVersion();
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
