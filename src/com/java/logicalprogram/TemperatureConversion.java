package com.java.logicalprogramming;

import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        // Call Util class method
        Util.temperatureConversion(temperature, choice);
    }

}
