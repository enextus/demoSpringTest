package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class App {

    private static final int IN_BOUND = 9;
    private static final int INTLENGTH = 30;
    private static final int INTWIDTH = 40;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

        System.out.println("Hello World!");

/*        ImpCalcSquareArea testSquare = new ImpCalcSquareArea();

        System.out.println("TestSquare: " + testSquare.getClass());
        System.out.println("testIntegerArea: " + testSquare.squareID);
        System.out.println("getTestIntegerLength: " + testSquare.getGetTestIntegerLengthInit());
        System.out.println("getTestIntegerWidth: " + testSquare.getGetTestIntegerWidthInit());
        System.out.println("testIntegerArea: " + testSquare.getTestIntegerArea());
        System.out.println("CalculateArea: " + testSquare.CalculateArea(INTLENGTH, INTWIDTH));*/

        System.out.println("\n");

        for (int i = 0; i < 25; i++) {

            System.out.println(Library.randomInt(IN_BOUND));
            System.out.println("----------------  " + " e76bdddb-f596-4a6e-9bab-fefc36c85016 " + "  -----------");

            System.out.println(Library.randomInt(IN_BOUND));

            Integer rndSeconds = Library.randomInt(IN_BOUND);
            Integer rndSecond2 = Library.randomInt(IN_BOUND);
            Integer rndSecond3 = Library.randomInt(IN_BOUND);

            String formattedDate = DateTimeFormatter.ofPattern("SSSSSS").withZone(ZoneId.systemDefault()).format(Instant.now());

            Library.sleepAFewSecondsOfRandomLength(IN_BOUND);

            System.out.println("" /*+ (i + 1) + ". formattedDate: "*/ + rndSeconds + rndSecond2 + formattedDate + rndSecond3);

        }

    }

}
