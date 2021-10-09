package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private final Display display = new Display();
    private double val;

    public double add(double a, double b) {
        val = a + b;
        display.displayValue(val);
        return val;
    }

    public double sub(double a, double b) {
        val = a - b;
        display.displayValue(val);
        return val;
    }

    public double mul(double a, double b) {
        val = a * b;
        display.displayValue(val);
        return val;
    }

    public double div(double a, double b) {
        if (b == 0) {
            System.out.println("Nie dzielimy przez 0");
            return 0;
        } else {
            val = a / b;
            display.displayValue(val);
        }
        return val;
    }
}
