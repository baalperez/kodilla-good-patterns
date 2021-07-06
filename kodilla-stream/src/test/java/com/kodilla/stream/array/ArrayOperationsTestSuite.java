package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        //When
        double result = ArrayOperations.getAverage(array);

        //Then
        Assertions.assertEquals(9.5, result);
    }
}
