package com.java.corejava;

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its prime factors: ");
        int N = scanner.nextInt();

        // Validate input
        if (N <= 1) {
            System.out.println("Please enter a number greater than 1.");
            return;
        }

        System.out.print("Prime factors of " + N + " are: ");

        // Traverse till i*i <= N
        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.print(i + " ");
                N = N / i;
            }
        }

        // If remaining N is greater than 1, it is a prime factor
        if (N > 1) {
            System.out.print(N);
        }

        scanner.close();
    }
}
