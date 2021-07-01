package com.kodilla.testing.forum.statistics;

public class PostsAndComments {

    private Statistics statistics;

    private int postsCount;
    private int commentsCount;
    private int usersCount;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    public PostsAndComments(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if (usersCount > 0) {
            averageNumberOfPostsPerUser = postsCount / usersCount;
            averageNumberOfCommentsPerUser = commentsCount / usersCount;
        }

        if (postsCount > 0) {
            averageNumberOfCommentsPerPost = (double) commentsCount / postsCount;
        }
    }

    public String showStatistics() {
        calculateAdvStatistics(statistics);
        String result = getUsersCount() + ", " + getPostsCount() + ", " + getCommentsCount() + ", " +
                getAverageNumberOfPostsPerUser() + ", " + getAverageNumberOfCommentsPerUser() + ", " +
                getAverageNumberOfCommentsPerPost();
        return result;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public int getUsersCount() {
        return usersCount;
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

    public void setUsersCount(int usersCount) {
        this.usersCount = usersCount;
    }

    public void setAverageNumberOfPostsPerUser(double averageNumberOfPostsPerUser) {
        this.averageNumberOfPostsPerUser = averageNumberOfPostsPerUser;
    }

    public void setAverageNumberOfCommentsPerUser(double averageNumberOfCommentsPerUser) {
        this.averageNumberOfCommentsPerUser = averageNumberOfCommentsPerUser;
    }

    public void setAverageNumberOfCommentsPerPost(double averageNumberOfCommentsPerPost) {
        this.averageNumberOfCommentsPerPost = averageNumberOfCommentsPerPost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostsAndComments that = (PostsAndComments) o;

        if (postsCount != that.postsCount) return false;
        if (commentsCount != that.commentsCount) return false;
        if (usersCount != that.usersCount) return false;
        if (Double.compare(that.averageNumberOfPostsPerUser, averageNumberOfPostsPerUser) != 0) return false;
        if (Double.compare(that.averageNumberOfCommentsPerUser, averageNumberOfCommentsPerUser) != 0)
            return false;
        return Double.compare(that.averageNumberOfCommentsPerPost, averageNumberOfCommentsPerPost) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = postsCount;
        result = 31 * result + commentsCount;
        result = 31 * result + usersCount;
        temp = Double.doubleToLongBits(averageNumberOfPostsPerUser);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averageNumberOfCommentsPerUser);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averageNumberOfCommentsPerPost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}