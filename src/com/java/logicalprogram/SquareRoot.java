package com.java.logicalprogram;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative number: ");
        double c = sc.nextDouble();

        double result = Util.sqrt(c);

        System.out.println("Square Root = " + result);
    }
}
