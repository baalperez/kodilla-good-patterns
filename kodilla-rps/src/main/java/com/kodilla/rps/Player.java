package com.kodilla.rps;

import java.util.Scanner;

public class Player {

    private String name;
    private int numberOfRoundToWin;

    public String getName() {
        return name;
    }

    public int getNumberOfRoundToWin() {
        return numberOfRoundToWin;
    }

    public void setName() {
        String tmpName;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("What is your name?");
            tmpName = scanner.nextLine();
            if (tmpName.isEmpty()) {
                System.out.print("You did not write anything. ");
            }
        } while (tmpName.isEmpty());
        this.name = tmpName;
    }

    public void setNumberOfRoundToWin() {
        Scanner scanner = new Scanner(System.in);
        int quantity;
        do {
            System.out.println("How many won rounds we play to?");
            quantity = scanner.nextInt();
        } while (!(quantity > 0));
        this.numberOfRoundToWin = quantity;
    }
}
