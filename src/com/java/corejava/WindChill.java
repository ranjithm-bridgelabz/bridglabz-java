package com.java.corejava;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        System.out.print("Enter temperature in Fahrenheit: ");
        double t = scanner.nextDouble();

        System.out.print("Enter wind speed in miles per hour: ");
        double v = scanner.nextDouble();

        // Calculate wind chill using Math.pow()
        double windChill = 35.74
                + 0.6215 * t
                + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

        // Print output
        System.out.println("Wind Chill = " + windChill);

        scanner.close();
    }
}
