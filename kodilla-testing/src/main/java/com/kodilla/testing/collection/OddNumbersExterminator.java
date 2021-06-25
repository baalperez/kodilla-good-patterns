package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    List<Integer> numbersList;

    public OddNumbersExterminator(List<Integer> numbersList) {
        this.numbersList = numbersList;
    }

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> oddListNumbers = new ArrayList<>();
        if (!numbers.isEmpty()) {
            System.out.println("New odd numbers list");
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    oddListNumbers.add(number);
                }
            }
        } else {
            System.out.println("List is empty");
        }
        return oddListNumbers;
    }
}
