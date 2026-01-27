package com.java.logicalprogram;

import java.util.Scanner;

public class Stopwatch {

    public static long startTimer() {
        return System.currentTimeMillis();
    }

    // Static function to get stop time
    public static long stopTimer() {
        return System.currentTimeMillis();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press ENTER to start the Stopwatch");
        sc.nextLine();  // Start

        long startTime = startTimer();

        System.out.println("Press ENTER to stop the Stopwatch");
        sc.nextLine();  // Stop

        long endTime = stopTimer();

        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time: " + (elapsedTime / 1000.0) + " seconds");
    }
}
