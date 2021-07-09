package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) throws Exception {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(1.5, 2);
        } catch (Exception e) {
            System.out.println("The condition is true. Type of Exception: " + e);
        } finally {
            System.out.println("End of program");
        }
    }
}
