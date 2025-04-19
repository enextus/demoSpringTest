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
    private static final int INTLENGTH = 30;
    private static final int INTWIDTH = 40;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

        ImpCalcSquareArea testSquare = new ImpCalcSquareArea();
        System.out.println("TestSquare: " + testSquare.getClass());
        System.out.println("testIntegerArea: " + testSquare.squareID);
        System.out.println("getTestIntegerLength: " + testSquare.getGetTestIntegerLengthInit());
        System.out.println("getTestIntegerWidth: " + testSquare.getGetTestIntegerWidthInit());
        System.out.println("testIntegerArea: " + testSquare.getTestIntegerArea());
        System.out.println("CalculateArea: " + testSquare.CalculateArea(INTLENGTH, INTWIDTH));

        for (int i = 0; i < 5; i++) {
            Integer rndSecondsOne = Library.randomInt(IN_BOUND);
            Integer rndSecondsTwo = Library.randomInt(IN_BOUND);
            Integer rndSecondsThree = Library.randomInt(IN_BOUND);
            Integer rndSecondsFour = Library.randomInt(IN_BOUND);

            String fmtDate = DateTimeFormatter.ofPattern("SSSSSS").withZone(ZoneId.systemDefault())
                    .format(Instant.now());

            Library.sleepAFewSecondsOfRandomLength(IN_BOUND_SECONDS);

            System.out.println("**");
            System.out.println(" ");
            System.out.println("rndSecondsOne: " + rndSecondsOne + ";" + " " + "rndSecondsTwo: " + rndSecondsTwo + ";" + " " + "rndSecondsThree: " + rndSecondsThree + ";" + "rndSecondsFour: " + rndSecondsFour + ";");

            System.out.println("" + (i + 1) + ". formattedDate: " + rndSecondsOne + rndSecondsTwo + rndSecondsThree + fmtDate + rndSecondsFour);

            System.out.println("");
        }
    }

}
