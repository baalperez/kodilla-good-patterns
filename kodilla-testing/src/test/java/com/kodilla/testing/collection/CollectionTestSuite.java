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
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(numberList1);

        //When
        List result = oddNumbersExterminator.exterminate(numberList1);

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

        Integer[] numberList2 = new Integer[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(Arrays.asList(numberList1));

        //When
        List result = oddNumbersExterminator.exterminate(Arrays.asList(numberList1));
        List expectedResult = Arrays.asList(numberList2);

        //Then
        Assertions.assertEquals(expectedResult, result);

        ////////////////////////////   drugie rozwiązanie   ///////////////////////////////
/*
        //Given
        List<Integer> numberList1 = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numberList1.add(i);
        }

        List<Integer> numberList2 = new ArrayList<>();
        numberList2.add(2);
        numberList2.add(4);
        numberList2.add(6);
        numberList2.add(8);
        numberList2.add(10);
        numberList2.add(12);
        numberList2.add(14);
        numberList2.add(16);
        numberList2.add(18);
        numberList2.add(20);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(numberList1);

        //When
        List result = oddNumbersExterminator.exterminate(numberList1);
        List expectedResult = numberList2;

        //Then
        Assertions.assertEquals(expectedResult, result);
 */
    }
}
