package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public final String shopping = "SHOPPING";
    public final String painting = "PAINTING";
    public final String diving = "DIVING";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case shopping -> new ShoppingTask("Shopping", "apples", 4);
            case painting -> new PaintingTask("Painting", "red", "room");
            case diving -> new DrivingTask("Diving", "Adriatic Sea", "diving cylinder");
            default -> null;
        };
    }
}
