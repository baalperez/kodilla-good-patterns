package com.kodilla.testing.shape;

import com.kodilla.testing.shape.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for shapes")
    class TestShapes {

        @Test
        void testAddFigure() {
            //Given
            Shape square = new Square("Kwadrat", 10);
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            shapeCollector.addFigure(square);
            //Then
            Assertions.assertEquals(1, shapeCollector.shapeList.size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            Shape square = new Square("Kwadrat", 10);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.shapeList.add(square);

            //When
            boolean result = shapeCollector.removeFigure(square);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.shapeList.size());
        }

        @Test
        void testGetFigure() {
            //Given
            Shape square = new Square("Kwadrat", 10);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.shapeList.add(square);

            //When
            Shape theShape = shapeCollector.shapeList.get(0);

            //Then
            Assertions.assertEquals(theShape, square);
        }

    }

    @Nested
    @DisplayName("Tests for display")
    class TestDisplay {

        @Test
        void testShowFigures() {
            //Given
            Shape square = new Square("Kwadrat", 10);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.shapeList.add(square);

            //When
            String result = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals(result, square.getShapeName());
        }
    }
}
