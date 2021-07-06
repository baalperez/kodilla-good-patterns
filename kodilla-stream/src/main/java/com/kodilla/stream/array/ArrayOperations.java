package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        numbers = IntStream.range(0, numbers.length)
                .toArray();
        System.out.println(Arrays.toString(numbers));

        double averageResult = IntStream.range(0, numbers.length)
                .average().getAsDouble();

        return averageResult;
    }
}
