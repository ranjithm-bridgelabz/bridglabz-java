package com.java.javafundamental.LineComparison;


import java.util.Scanner;

public class LineComparisonUC3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Line 1 coordinates:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter Line 2 coordinates:");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        Double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        Double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));

        int result = length1.compareTo(length2);

        if (result == 0) {
            System.out.println("Both Lines are Equal");
        } else if (result > 0) {
            System.out.println("Line 1 is Greater than Line 2");
        } else {
            System.out.println("Line 1 is Less than Line 2");
        }
    }
}
