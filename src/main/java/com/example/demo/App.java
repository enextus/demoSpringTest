package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class App {

    private static final int IN_BOUND = 9;
    private static final double IN_BOUND_SECONDS = 1.0;

/*	private static final int INTLENGTH = 30;
	private static final int INTWIDTH = 40;*/

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

//		System.out.println("Hello World!");

/*        ImpCalcSquareArea testSquare = new ImpCalcSquareArea();
        System.out.println("TestSquare: " + testSquare.getClass());
        System.out.println("testIntegerArea: " + testSquare.squareID);
        System.out.println("getTestIntegerLength: " + testSquare.getGetTestIntegerLengthInit());
        System.out.println("getTestIntegerWidth: " + testSquare.getGetTestIntegerWidthInit());
        System.out.println("testIntegerArea: " + testSquare.getTestIntegerArea());
        System.out.println("CalculateArea: " + testSquare.CalculateArea(INTLENGTH, INTWIDTH));*/

        for (int i = 0; i < 5; i++) {

			System.out.printf("" + i + ".: ");

            Integer rndSeconds1 = Library.randomInt(IN_BOUND);
            Integer rndSeconds2 = Library.randomInt(IN_BOUND);
            Integer rndSeconds3 = Library.randomInt(IN_BOUND);

            String formattedDate = DateTimeFormatter.ofPattern("SSSSSS").withZone(ZoneId.systemDefault())
                    .format(Instant.now());

            Library.sleepAFewSecondsOfRandomLength(IN_BOUND_SECONDS);

            System.out.println("" + rndSeconds1 + " s.");
            System.out.println("" + rndSeconds2 + " s.");
            System.out.println("" + rndSeconds3 + " s.");

            System.out.println("" + (i + 1) + ". formattedDate: " + rndSeconds1 + rndSeconds2 + formattedDate + rndSeconds3);

        }

    }

}
