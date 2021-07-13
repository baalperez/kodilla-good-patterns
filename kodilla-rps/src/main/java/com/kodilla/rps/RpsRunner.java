
package com.kodilla.rps;

import java.io.IOException;

public class RpsRunner {

    public static void main(String[] args) throws IOException {

        boolean end = false;
        Introduction introduction = new Introduction();
        introduction.intro();
        introduction.gameOption(introduction.choice());
        Game game = new Game();
        int whatToDo;
        whatToDo = game.decision();
        while (!end) {

            switch (whatToDo) {
                case 0 -> {
                    System.out.println("Good Bye");
                    end = true;
                }
                case 1 -> {
                    game.round();
                    whatToDo = game.decision();
                    if (whatToDo == 0) {
                        System.out.println("Good Bye");
                        end = true;
                    }
                }
            }
        }
    }
}

