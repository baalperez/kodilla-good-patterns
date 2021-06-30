package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PostsAndCommentsTestSuite {

    @Mock
    private Statistics statisticsMock;

    @BeforeEach
    public void before() {
    }

    @Test
    public void testAverageNumberOfPostsPerUserWhen0Posts() {
        //Given
        PostsAndComments postsAndComments = new PostsAndComments(statisticsMock);
        postsAndComments.setUserCount(100);
        postsAndComments.setPostsCount(0);

        //When
        double expectedResult = postsAndComments.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, expectedResult);
    }

    @Test
    public void testAverageNumberOfPostsPerUserWhen1000Posts() {
        //Given
        PostsAndComments postsAndComments = new PostsAndComments(statisticsMock);
        postsAndComments.setUserCount(20);
        postsAndComments.setPostsCount(1000);
        postsAndComments.setCommentsCount(1);

        //When
        double expectedResult = postsAndComments.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(50, expectedResult);
    }

    @Test
    public void testAverageNumberOfCommentsPerUserWhen0Comments() {
        //Given
        PostsAndComments postsAndComments = new PostsAndComments(statisticsMock);
        postsAndComments.setUserCount(20);
        postsAndComments.setCommentsCount(0);

        //When
        double expectedResult = postsAndComments.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, expectedResult);
    }

    @Test
    public void testAverageNumberOfCommentsPerPostWhenMorePosts() {
        //Given
        PostsAndComments postsAndComments = new PostsAndComments(statisticsMock);
        postsAndComments.setPostsCount(525);
        postsAndComments.setCommentsCount(75);
        postsAndComments.setUserCount(1);

        //When
        double expectedResult = postsAndComments.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(7, expectedResult);
    }

    @Test
    public void testAverageNumberOfCommentsPerPostWhenMoreComments() {
        //Given
        PostsAndComments postsAndComments = new PostsAndComments(statisticsMock);
        postsAndComments.setPostsCount(75);
        postsAndComments.setCommentsCount(500);
        postsAndComments.setUserCount(1);

        //When
        double expectedResult = postsAndComments.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0.15, expectedResult);
    }
}
