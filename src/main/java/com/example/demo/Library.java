package com.example.demo;

import java.util.Random;

public class Library {
    private static final double MS_IN_SECOND = 1000.0;
    private static final Random RANDOM = new Random();

    public static Integer randomInt(int bound) {

        return RANDOM.nextInt(bound);
    }

    public static void sleepAFewSecondsOfRandomLength(double bound) {
        double rndSeconds = RANDOM.nextDouble(bound);
        sleepAFewSeconds(rndSeconds);
    }

    public static void sleepAFewSeconds(double seconds) {
        try {
            Thread.sleep((long) (seconds * MS_IN_SECOND));
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

    }

}
