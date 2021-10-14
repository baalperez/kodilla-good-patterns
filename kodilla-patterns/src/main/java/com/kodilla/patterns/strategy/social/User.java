package com.kodilla.patterns.strategy.social;

public class User {

    private final String username;
    public SocialPublisher socialPublisher;

    public User(final String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setSharingStrategy(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
