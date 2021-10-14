package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User karolina = new Millenials("Karolina Nowak");
        User iza = new YGeneration("Iza Kszuk");
        User dawid = new ZGeneration("Dawid Popis");

        //When
        String karolinaUsesToShare = karolina.sharePost();
        System.out.println("Karolina uses: " + karolinaUsesToShare);
        String izaUsesToShare = iza.sharePost();
        System.out.println("Iza uses: " + izaUsesToShare);
        String dawidUsesToShare = dawid.sharePost();
        System.out.println("Dawid uses: " + dawidUsesToShare);

        //Then
        assertEquals("Communication by Facebook", karolinaUsesToShare);
        assertEquals("Communication by Twitter", izaUsesToShare);
        assertEquals("Communication by Snapchat", dawidUsesToShare);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User karolina = new Millenials("Karolina Nowak");

        //When
        String karolinaUsesToShare = karolina.sharePost();
        System.out.println("Karolina uses: " + karolinaUsesToShare);
        karolina.setSharingStrategy(new TwitterPublisher());
        karolinaUsesToShare = karolina.sharePost();
        System.out.println("Karolina now uses: " + karolinaUsesToShare);

        //Then
        assertEquals("Communication by Twitter", karolinaUsesToShare);
    }
}
