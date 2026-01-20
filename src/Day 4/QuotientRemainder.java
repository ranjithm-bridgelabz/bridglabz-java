package com.java.corejava;

import java.util.Scanner;

public class QuotientRemainder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Validate divisor
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // Output results
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

        scanner.close();
    }
}
