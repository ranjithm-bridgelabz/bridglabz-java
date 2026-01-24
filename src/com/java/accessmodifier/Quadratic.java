package com.java.accessmodifier;

public class Quadratic {
    public static void main(String[] args) {

        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);

            if (a == 0) {
                System.out.println("Not a quadratic equation");
                return;
            }

            double delta = b * b - 4 * a * c;

            if (delta >= 0) {
                double root1 = (-b + Math.sqrt(delta)) / (2 * a);
                double root2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("Root 1 = " + root1);
                System.out.println("Root 2 = " + root2);
            } else {
                System.out.println("No real roots");
            }

        } catch (Exception e) {
            // Handles missing arguments or invalid input
            System.out.println("Invalid input. Unable to find roots.");
        }
    }
}
