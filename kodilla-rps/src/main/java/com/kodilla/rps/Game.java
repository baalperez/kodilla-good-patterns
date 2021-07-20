package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);
    private int playerWinsCount;
    private int pcWinsCount;
    private int roundNumber;
    Player player = new Player();


    public void round() {
        roundNumber = 1;
        playerWinsCount = 0;
        pcWinsCount = 0;
        player.setName();
        player.setNumberOfRoundToWin();
        do {
            System.out.println();
            System.out.println("-----------------------------------------------------");
            System.out.println(">>   Round number " + getRoundNumber());
            System.out.println(">>   " + player.getName() + " " + playerWinsCount + " : " + pcWinsCount + " Computer");
            basicVersionMove();
        } while (getPlayerWinsCount() != player.getNumberOfRoundToWin() && getPcWinsCount() != player.getNumberOfRoundToWin());
        System.out.println();
        System.out.println("End of the game");
        System.out.println(">>   " + player.getName() + " " + playerWinsCount + " : " + pcWinsCount + " Computer");
    }

    public void basicVersionMove() {
        Random random = new Random();
        String move = null;
        String quitDecision;
        do {
            try {
                System.out.println("Choose your move (1-Rock / 2-Paper / 3-Scissors / n - for New Game)");
                move = scanner.nextLine().toLowerCase();
                if (move.equals("n")) {
                    System.out.println("Are you sure, you want to start a new game? y - yes / any other key to cancel");
                    quitDecision = scanner.nextLine().toLowerCase();
                    if (quitDecision.equals("y")) {
                        round();
                    }
                } else
                    Integer.parseInt(move);
            } catch (Exception e) {
                System.out.println("Try again");
            }
        } while (!move.equals("1") && !move.equals("2") && !move.equals("3") && !move.equals("n"));

        int pcChoice = 1 + random.nextInt(3);
        System.out.println();
        String pcMove;

        if (pcChoice == 1) {
            pcMove = "ROCK";
            if (move.equals(Symbol.ROCK.getNumber())) {
                System.out.println(")))))      " + Symbol.ROCK.name() + " Vs " + pcMove);
                System.out.println(">>>>        Draw...");
                setRoundNumber(++roundNumber);
            } else if (move.equals(Symbol.PAPER.getNumber())) {
                System.out.println(")))))      " + Symbol.PAPER.name() + " Vs " + pcMove);
                System.out.println(">>>>        You win this round");
                setPlayerWinsCount(++playerWinsCount);
                setRoundNumber(++roundNumber);
            } else if (move.equals(Symbol.SCISSORS.getNumber())) {
                System.out.println(")))))      " + Symbol.SCISSORS.name() + " Vs " + pcMove);
                System.out.println(">>>>       Computer wins this round");
                setPcWinsCount(++pcWinsCount);
                setRoundNumber(++roundNumber);
            }
        }
        if (pcChoice == 2) {
            pcMove = "PAPER";
            if (move.equals(Symbol.ROCK.getNumber())) {
                System.out.println(")))))      " + Symbol.ROCK.name() + " Vs " + pcMove);
                System.out.println(">>>>       Computer wins this round");
                setPcWinsCount(++pcWinsCount);
                setRoundNumber(++roundNumber);
            } else if (move.equals(Symbol.PAPER.getNumber())) {
                System.out.println(")))))      " + Symbol.PAPER.name() + " Vs " + pcMove);
                System.out.println(">>>>       Draw...");
                setRoundNumber(++roundNumber);
            } else if (move.equals(Symbol.SCISSORS.getNumber())) {
                System.out.println(")))))      " + Symbol.SCISSORS.name() + " Vs " + pcMove);
                System.out.println(">>>>       You win this round");
                setPlayerWinsCount(++playerWinsCount);
                setRoundNumber(++roundNumber);
            }
        }
        if (pcChoice == 3) {
            pcMove = "SCISSORS";
            if (move.equals(Symbol.ROCK.getNumber())) {
                System.out.println(")))))      " + Symbol.ROCK.name() + " Vs " + pcMove);
                System.out.println(">>>>       You win this round");
                setPlayerWinsCount(++playerWinsCount);
                setRoundNumber(++roundNumber);
            } else if (move.equals(Symbol.PAPER.getNumber())) {
                System.out.println(")))))      " + Symbol.PAPER.name() + " Vs " + pcMove);
                System.out.println(">>>>       Computer wins this round");
                setPcWinsCount(++pcWinsCount);
                setRoundNumber(++roundNumber);
            } else if (move.equals(Symbol.SCISSORS.getNumber())) {
                System.out.println(")))))      " + Symbol.SCISSORS.name() + " Vs " + pcMove);
                System.out.println(">>   Draw...");
                setRoundNumber(++roundNumber);
            }
        }
    }

    public int decision() {
        String dec;
        do {
            System.out.println("Choose an option: x for Quit / n for New Game");
            dec = scanner.nextLine().toLowerCase();
            if (!dec.equals("x") && !dec.equals("n")) {
                System.out.println("Try again");
            }
        } while (!dec.equals("x") && !dec.equals("n"));
        if (dec.equals("x")) {
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