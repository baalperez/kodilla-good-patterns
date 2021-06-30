package com.kodilla.testing.forum.statistics;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class PostsAndComments {

    private Statistics statistics;

    private int postsCount;
    private int commentsCount;
    private int userCount;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    public PostsAndComments(Statistics statistics) {
        this.statistics = statistics;
    }

    public double calculateAdvStatistics(Statistics statistics) {
        if (postsCount == 0) {
            averageNumberOfPostsPerUser = 0;
            return averageNumberOfPostsPerUser;
        } else if (postsCount != 0) {
            if (((postsCount > commentsCount || postsCount < commentsCount) && (postsCount == 1) || (userCount == 1))) {
                averageNumberOfCommentsPerPost = (double) postsCount / commentsCount;
                return averageNumberOfCommentsPerPost;
            } else {
                averageNumberOfPostsPerUser = (double) postsCount / userCount;
                return averageNumberOfPostsPerUser;
            }
        } else if (commentsCount == 0) {
            averageNumberOfCommentsPerUser = 0;
            return averageNumberOfCommentsPerUser;
        } else if (userCount == 100) {
            userCount = 0;
            return userCount;
        }


        return 500.500;
    }

    public String showStatistics() {
        return Integer.valueOf(getUserCount()) + ", " + Integer.valueOf(getPostsCount()) + ", "
                + Integer.valueOf(getCommentsCount()) + ", " + Double.valueOf(getAverageNumberOfPostsPerUser()) + ", "
                + Double.valueOf(getAverageNumberOfCommentsPerUser()) + ", " + Double.valueOf(getAverageNumberOfCommentsPerPost());

    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public int getUserCount() {
        return userCount;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public void setPostsCount(int postsCount) {
        this.postsCount = postsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostsAndComments that = (PostsAndComments) o;

        if (postsCount != that.postsCount) return false;
        if (commentsCount != that.commentsCount) return false;
        return userCount == that.userCount;
    }

    @Override
    public int hashCode() {
        int result = postsCount;
        result = 31 * result + commentsCount;
        result = 31 * result + userCount;
        return result;
    }
}
