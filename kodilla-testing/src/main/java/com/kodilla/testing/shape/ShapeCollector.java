package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;


public class ShapeCollector {

    List<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapeList.contains(shape)) {
            shapeList.remove(shape);
            result = true;
        }
        return result;
    }

    public void getFigure(int n) {
        if (shapeList.size() > n) {
            System.out.print("Figura - " + shapeList.get(n).getShapeName() + ". ");
            System.out.println("Pole = " + shapeList.get(n).getField());
        } else {
            System.out.println("Brak indeksu w liście");
        }
    }

    public String showFigures() {
        String result = "";
        for (Shape shape : shapeList) {
            result += shape.getShapeName();
        }
        return result;
    }
}
