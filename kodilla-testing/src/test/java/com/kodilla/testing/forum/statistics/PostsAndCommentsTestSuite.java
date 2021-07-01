package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PostsAndCommentsTestSuite {

    public List<String> generateListOfUsers(int quantity) {
        List<String> theList = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            theList.add("Bob");
        }
        return theList;
    }

    @Mock
    private Statistics statisticsMock;

    @Test
    public void testAverageNumberOfPostsPerUserWhen0Posts() {
        //Given
        PostsAndComments postsAndComments = new PostsAndComments(statisticsMock);
        List<String> usersName = generateListOfUsers(100);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(usersName);

        //When
        postsAndComments.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0.0, postsAndComments.getAverageNumberOfPostsPerUser());
    }

    @Test
    public void testAverageNumberOfPostsPerUserWhen1000Posts() {
        //Given
        PostsAndComments postsAndComments = new PostsAndComments(statisticsMock);
        List<String> usersName = generateListOfUsers(100);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(usersName);

        //When
        postsAndComments.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(10.0, postsAndComments.getAverageNumberOfPostsPerUser());
    }

    @Test
    public void testAverageNumberOfCommentsPerUserWhen0Comments() {
        //Given
        PostsAndComments postsAndComments = new PostsAndComments(statisticsMock);
        List<String> usersName = generateListOfUsers(200);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.usersNames()).thenReturn(usersName);

        //When
        postsAndComments.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0.0, postsAndComments.getAverageNumberOfCommentsPerUser());
    }

    @Test
    public void testAverageNumberOfCommentsPerPostWhenMorePosts() {
        //Given
        PostsAndComments postsAndComments = new PostsAndComments(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(75);

        //When
        postsAndComments.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0.15, postsAndComments.getAverageNumberOfCommentsPerPost());
    }

    @Test
    public void testAverageNumberOfCommentsPerPostWhenMoreComments() {
        //Given
        PostsAndComments postsAndComments = new PostsAndComments(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(75);
        when(statisticsMock.commentsCount()).thenReturn(525);

        //When
        postsAndComments.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(7.0, postsAndComments.getAverageNumberOfCommentsPerPost());
    }

    @Test
    public void testAverageWhen0Users() {
        //Given
        PostsAndComments postsAndComments = new PostsAndComments(statisticsMock);
        List<String> usersName = generateListOfUsers(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        postsAndComments.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0.0, postsAndComments.getAverageNumberOfPostsPerUser());
        Assertions.assertEquals(0.0, postsAndComments.getAverageNumberOfCommentsPerUser());
    }

    @Test
    public void testAverageWhen1000Users() {
        //Given
        PostsAndComments postsAndComments = new PostsAndComments(statisticsMock);
        List<String> usersName = generateListOfUsers(1000);
        when(statisticsMock.postsCount()).thenReturn(25000);
        when(statisticsMock.commentsCount()).thenReturn(100000);
        when(statisticsMock.usersNames()).thenReturn(usersName);

        //When
        postsAndComments.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(25.0, postsAndComments.getAverageNumberOfPostsPerUser());
        Assertions.assertEquals(100.0, postsAndComments.getAverageNumberOfCommentsPerUser());
    }

    @Test
    void testDisplayStatistics() {
        //Given
        PostsAndComments postsAndComments = new PostsAndComments(statisticsMock);
        List<String> usersName = generateListOfUsers(1000);
        when(statisticsMock.postsCount()).thenReturn(25000);
        when(statisticsMock.commentsCount()).thenReturn(100000);
        when(statisticsMock.usersNames()).thenReturn(usersName);

        //When
        postsAndComments.showStatistics();

        //Then
        Assertions.assertEquals("1000, 25000, 100000, 25.0, 100.0, 4.0", postsAndComments.showStatistics());
    }
}
