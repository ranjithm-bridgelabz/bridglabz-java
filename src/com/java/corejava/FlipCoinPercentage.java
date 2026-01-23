package com.java.corejava;

import java.util.Random;
import java.util.Scanner;

public class FlipCoinPercentage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of times to flip the coin: ");
        int flips = scanner.nextInt();

        // Validate input
        if (flips <= 0) {
            System.out.println("Error: Number of flips must be a positive integer.");
            return;
        }

        int headsCount = 0;
        int tailsCount = 0;

        // Flip the coin
        for (int i = 0; i < flips; i++) {
            double randomValue = random.nextDouble(); // generates value between 0.0 and 1.0

            if (randomValue < 0.5) {
                tailsCount++;
            } else {
                headsCount++;
            }
        }

        // Calculate percentages
        double headsPercentage = (headsCount * 100.0) / flips;
        double tailsPercentage = (tailsCount * 100.0) / flips;

        // Output results
        System.out.println("Total Flips: " + flips);
        System.out.println("Heads: " + headsCount + " (" + headsPercentage + "%)");
        System.out.println("Tails: " + tailsCount + " (" + tailsPercentage + "%)");

        scanner.close();
    }
}
