package com.java.corejava;

import java.util.Scanner;

public class PowerOfTwo {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the power value N: ");
        int N = scanner.nextInt();

        // Validate input
        if (N < 0 || N >= 31) {
            System.out.println("Error: N must be between 0 and 30 (0 <= N < 31).");
            return;
        }

        System.out.println("Powers of 2 up to 2^" + N + ":");

        // Repeat until i equals N
        for (int i = 0; i <= N; i++) {
            int power = 1 << i;   // 2^i
            System.out.println("2^" + i + " = " + power);
        }

        scanner.close();
    }
}
