package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest(classes = BoardConfig.class)
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.addToToDoList("Task1");
        board.addToInProgressList("Task2");
        board.addToDoneList("Task3");

        //Then
        System.out.println(board.toDoList.tasks.size());
        System.out.println(board.inProgressList.tasks.size());
        System.out.println(board.doneList.tasks.size());
    }
}
