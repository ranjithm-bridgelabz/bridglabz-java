package com.java.logicalprogramming;

public class Util {

    public static void temperatureConversion(double temperature, int choice) {

        if (choice == 1) {
            // Celsius to Fahrenheit
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        }
        else if (choice == 2) {
            // Fahrenheit to Celsius
            double celsius = (temperature - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);
        }
        else {
            System.out.println("Invalid choice");
        }
    }
    public static double monthlyPayment(double P, int Y, double R) {

        int n = 12 * Y;              // number of months
        double r = R / (12 * 100);   // monthly interest rate

        double payment = (P * r) / (1 - Math.pow(1 + r, -n));

        return payment;
    }

    public static double sqrt(double c) {

        if (c < 0) {
            return Double.NaN; // Not a Number for negative input
        }

        double epsilon = 1e-15;
        double t = c;

        while (Math.abs(t - c / t) > epsilon * t) {
            t = (t + c / t) / 2;
        }

        return t;
    }
}
