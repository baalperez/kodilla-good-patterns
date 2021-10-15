package com.kodilla.patterns.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeFactoryTestSuite {

    @Test
    void testFactoryCircle() {
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //When
        Shape circle = shapeFactory.makeShape(ShapeFactory.CIRCLE);
        //Then
        assertEquals(Math.PI * Math.pow(4.5, 2), circle.getArea());
        assertEquals("The rounded circle", circle.getName());
    }

    @Test
    void testFactorySquare() {
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //When
        Shape square = shapeFactory.makeShape(ShapeFactory.SQUARE);
        //Then
        assertEquals(49, square.getArea());
        assertEquals("The angular square", square.getName());
    }

    @Test
    void testFactoryRectangle() {
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //When
        Shape rectangle = shapeFactory.makeShape(ShapeFactory.RECTANGLE);
        //Then
        assertEquals(37.5, rectangle.getArea());
        assertEquals("The long rectangle", rectangle.getName());
    }
}
