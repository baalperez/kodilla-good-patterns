package com.kodilla.rps;

import java.util.Scanner;

public class Player {

    Scanner scanner = new Scanner(System.in);
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
        int quantity = 0;
        do {
            try {
                System.out.println("How many won rounds we play to?");
                quantity = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Bad choice");
                scanner.next();
            }
        } while (!(quantity > 0));
        this.numberOfRoundToWin = quantity;
    }
}
