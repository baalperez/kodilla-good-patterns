package com.kodilla.rps;

import java.io.IOException;
import java.util.Random;


public class Game {

    private int playerWinsCount;
    private int pcWinsCount;
    private int roundNumber;
    Player player = new Player();

    public void round() throws IOException {
        player.setName();
        player.setNumberOfRoundToWin();
        roundNumber = 1;
        playerWinsCount = 0;
        pcWinsCount = 0;
        do {
            System.out.println("-----------------------------------------------------");
            System.out.println(">>   Round number " + getRoundNumber());
            System.out.println(">>   " + player.getName() + " " + playerWinsCount + " : " + pcWinsCount + " Computer");
            basicVersionMove();
        } while (getPlayerWinsCount() != player.getNumberOfRoundToWin() && getPcWinsCount() != player.getNumberOfRoundToWin());
        System.out.println();
        System.out.println("End of the game");
        System.out.println(">>   " + player.getName() + " " + playerWinsCount + " : " + pcWinsCount + " Computer");
    }

    public void basicVersionMove() throws IOException {
        Random random = new Random();
        char choice, ignore;
        do {
            System.out.println("Choose your move (1-Rock / 2-Paper / 3-Scissors / n for New Game)");
            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (choice == 'n' || choice == 'N') {
                System.out.println("Are you sure you want to quit this game and play a new game? y - yes / any other key to cancel");
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
                if (choice == 'y' || choice == 'Y') {
                    round();
                }
            }
        } while (choice != '1' && choice != '2' && choice != '3' && choice != 'y' && choice != 'Y');
        int pcChoice = 1 + random.nextInt(3);

        if (choice == '1' && pcChoice == 1) {
            System.out.println(")))))      Rock Vs Rock");
            System.out.println(">>   Draw...");
            setRoundNumber(++roundNumber);
        }
        if (choice == '1' && pcChoice == 2) {
            System.out.println(")))))      Rock Vs Paper");
            System.out.println(">>   Computer wins this round");
            setPcWinsCount(++pcWinsCount);
            setRoundNumber(++roundNumber);
        }
        if (choice == '1' && pcChoice == 3) {
            System.out.println(")))))      Rock Vs Scissors");
            System.out.println(">>   You win this round");
            setPlayerWinsCount(++playerWinsCount);
            setRoundNumber(++roundNumber);
        }
        if (choice == '2' && pcChoice == 1) {
            System.out.println(")))))      Paper Vs Rock");
            System.out.println(">>   You win this round");
            setPlayerWinsCount(++playerWinsCount);
            setRoundNumber(++roundNumber);
        }
        if (choice == '2' && pcChoice == 2) {
            System.out.println(")))))      Paper Vs Paper");
            System.out.println(">>   Draw...");
            setRoundNumber(++roundNumber);
        }
        if (choice == '2' && pcChoice == 3) {
            System.out.println(")))))      Paper Vs Scissors");
            System.out.println(">>   Computer wins this round");
            setPcWinsCount(++pcWinsCount);
            setRoundNumber(++roundNumber);
        }
        if (choice == '3' && pcChoice == 1) {
            System.out.println(")))))      Scissors Vs Rock");
            System.out.println(">>   Computer wins this round");
            setPcWinsCount(++pcWinsCount);
            setRoundNumber(++roundNumber);
        }
        if (choice == '3' && pcChoice == 2) {
            System.out.println(")))))      Scissors Vs Paper");
            System.out.println(">>   You win this round");
            setPlayerWinsCount(++playerWinsCount);
            setRoundNumber(++roundNumber);
        }
        if (choice == '3' && pcChoice == 3) {
            System.out.println(")))))      Scissors Vs Scissors");
            System.out.println(">>   Draw...");
            setRoundNumber(++roundNumber);
        }
    }

    public int decision() throws IOException {
        char choice, ignore;
        do {
            System.out.println("Choose an option: x for Quit / n for New Game");
            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choice != 'x' && choice != 'X' && choice != 'n' && choice != 'N');
        if (choice == 'x' || choice == 'X') {
            return 0;
        }
        return 1;

    }

    public int getPlayerWinsCount() {
        return playerWinsCount;
    }

    public int getPcWinsCount() {
        return pcWinsCount;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setPlayerWinsCount(int playerWinsCount) {
        this.playerWinsCount = playerWinsCount;
    }

    public void setPcWinsCount(int pcWinsCount) {
        this.pcWinsCount = pcWinsCount;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }
}
