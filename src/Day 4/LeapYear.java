package com.java.corejava;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 4-digit year: ");
        int year = scanner.nextInt();

        // Validate input (4-digit year)
        if (year < 1000 || year > 9999) {
            System.out.println("Error: Please enter a valid 4-digit year.");
            return;
        }

        // Leap year logic
        boolean isLeapYear;

        if (year % 400 == 0) {
            isLeapYear = true;
        } else if (year % 100 == 0) {
            isLeapYear = false;
        } else {
            isLeapYear = (year % 4 == 0);
        }

        // Output result
        if (isLeapYear) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        scanner.close();
    }
}
