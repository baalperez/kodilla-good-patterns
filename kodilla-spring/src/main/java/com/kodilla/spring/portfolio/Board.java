package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

@Component
public class Board {

    TaskList toDoList = new TaskList();
    TaskList inProgressList = new TaskList();
    TaskList doneList = new TaskList();

    public void addToToDoList(String task) {
        toDoList.tasks.add(task);
        System.out.println("New task: " + task + " added to ToDoList");
    }

    public void addToInProgressList(String task) {
        inProgressList.tasks.add(task);
        System.out.println("New task: " + task + " added to InProgressList");
    }

    public void addToDoneList(String task) {
        doneList.tasks.add(task);
        System.out.println("New task: " + task + " added to DoneList");
    }
}
