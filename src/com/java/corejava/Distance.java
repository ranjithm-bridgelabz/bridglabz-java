package com.java.corejava;

import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        System.out.print("Enter value of x: ");
        int x = scanner.nextInt();

        System.out.print("Enter value of y: ");
        int y = scanner.nextInt();

        // Calculate Euclidean distance using Math.pow()
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        // Print output
        System.out.println(
                "Euclidean distance from (" + x + ", " + y + ") to (0, 0) is: " + distance
        );

        scanner.close();
    }
}
