package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(taskFactory.shopping);
        //Then
        assertEquals("Shopping", shoppingTask.getTaskName());
        assertEquals("Go shopping and buy 4.0 of apples", shoppingTask.executeTask());
        assertFalse(shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(taskFactory.painting);
        //Then
        assertEquals("Painting", paintingTask.getTaskName());
        assertEquals("Paint the room red", paintingTask.executeTask());
        assertFalse(paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryDiving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task divingTask = taskFactory.makeTask(taskFactory.diving);
        //Then
        assertEquals("Diving", divingTask.getTaskName());
        assertEquals("Go diving in Adriatic Sea using diving cylinder", divingTask.executeTask());
        assertTrue(divingTask.isTaskExecuted());
    }
}
