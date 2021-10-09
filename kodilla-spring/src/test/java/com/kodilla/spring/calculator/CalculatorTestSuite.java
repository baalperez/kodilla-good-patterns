package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = Calculator.class)
public class CalculatorTestSuite {

    @Test
    void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double additionResult = calculator.add(2, 3);
        double subtactionResult = calculator.sub(2, 3);
        double multiplicationResult = calculator.mul(2, 3);
        double divisionResult = calculator.div(6, 0);

        //Then
        assertEquals(5, additionResult);
        assertEquals(-1, subtactionResult);
        assertEquals(6, multiplicationResult);
        assertEquals(0, divisionResult);
    }
}
