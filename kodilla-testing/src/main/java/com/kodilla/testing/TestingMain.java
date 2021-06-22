package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // tu umieść kolejny test ->
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int a = 16;
        int b = 8;
        int addResult = calculator.add(a , b);
        int substractResult = calculator.substract(a, b);

        if (addResult == 24 && substractResult == 8) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
