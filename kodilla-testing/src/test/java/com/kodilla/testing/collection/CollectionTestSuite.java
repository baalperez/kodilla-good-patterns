package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.*;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName(
            "when create object with empty list," +
                    "then exterminate should return that the list is empty"
    )

    @Test
    void testCaseOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> numberList1 = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        oddNumbersExterminator.exterminate(numberList1);

        //Then
        Assertions.assertTrue(numberList1.isEmpty());
    }

    @DisplayName(
            "when create object with some numbers list, " +
                    "then exterminate should return new list only with odd numbers)"
    )

    @Test
    void testCaseOddNumbersExterminatorNormalList() {
        //Given
        Integer[] numberList1 = new Integer[20];
        for (int i = 0; i < numberList1.length; i++) {
            numberList1[i] = i+1;
        }

        Integer[] expected = new Integer[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        List result = oddNumbersExterminator.exterminate(Arrays.asList(numberList1));

        //Then
        Assertions.assertEquals(Arrays.asList(expected), result);

        ////////////////////////////   drugie rozwiązanie   ///////////////////////////////
/*
        //Given
        List<Integer> numberList1 = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numberList1.add(i);
        }

        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        expected.add(10);
        expected.add(12);
        expected.add(14);
        expected.add(16);
        expected.add(18);
        expected.add(20);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        List result = oddNumbersExterminator.exterminate(numberList1);

        //Then
        Assertions.assertEquals(expected, result);

 */
    }
}

