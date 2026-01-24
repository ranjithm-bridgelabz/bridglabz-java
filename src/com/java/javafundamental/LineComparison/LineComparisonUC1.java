package com.java.javafundamental.LineComparison;

import java.util.Scanner;

public class LineComparisonUC1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Line Comparison Computation Program");

        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();

        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();

        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();

        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();

        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Length of the Line = " + length);
    }
}

