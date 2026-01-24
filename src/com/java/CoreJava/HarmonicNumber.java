package com.java.corejava;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Harmonic value N: ");
        int N = scanner.nextInt();

        // Validate input
        if (N == 0) {
            System.out.println("Error: N must not be 0.");
            return;
        }

        double harmonic = 0.0;

        // Compute harmonic series
        for (int i = 1; i <= N; i++) {
            harmonic += 1.0 / i;
        }

        // Output result
        System.out.println("The " + N + "th Harmonic value is: " + harmonic);

        scanner.close();
    }
}
