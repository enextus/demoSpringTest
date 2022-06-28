package com.example.demo;

import java.util.Random;

public class Library {
    private static final int MS_IN_SECOND = 1000;
    private static final Random RANDOM = new Random();

    public static Integer randomInt(int bound) {

        return RANDOM.nextInt(bound);
    }

    public static void sleepAFewSecondsOfRandomLength(int bound) {
        int rndSeconds = RANDOM.nextInt(bound);
        System.out.println("" + rndSeconds + " s.");
        sleepAFewSeconds(rndSeconds);
    }

    public static void sleepAFewSeconds(int seconds) {
        try {
            Thread.sleep((long) seconds * MS_IN_SECOND);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

    }

}
