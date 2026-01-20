package com.java.corejava;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read coefficients
        System.out.print("Enter value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value of c: ");
        double c = scanner.nextDouble();

        // Calculate delta
        double delta = b * b - 4 * a * c;

        // Check nature of roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);

        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("Both roots are equal:");
            System.out.println("Root = " + root);

        } else {
            System.out.println("Roots are imaginary (delta < 0).");
        }

        scanner.close();
    }
}
