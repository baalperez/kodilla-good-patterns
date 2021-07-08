package com.kodilla.exception.test;

import java.io.IOException;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {

        double result = 0;
        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            result = firstChallenge.divide(3, 0);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("You can not divide by zero!");
        } finally {
            System.out.println("End of program");
        }
        System.out.println(result);
    }
}
