package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    Board board = new Board();

    @Bean
    public TaskList toDoList() {
        return board.toDoList;
    }

    @Bean
    public TaskList inProgressList() {
        return board.inProgressList;
    }

    @Bean
    public TaskList doneList() {
        return board.doneList;
    }
}
