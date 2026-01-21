package com.java.oops;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1 y1 x2 y2 for Line 1: ");
        Point p1 = new Point(scanner.nextInt(), scanner.nextInt());
        Point p2 = new Point(scanner.nextInt(), scanner.nextInt());

        System.out.print("Enter x3 y3 x4 y4 for Line 2: ");
        Point p3 = new Point(scanner.nextInt(), scanner.nextInt());
        Point p4 = new Point(scanner.nextInt(), scanner.nextInt());

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);

        System.out.println("Length of Line 1: " + line1.getLength());
        System.out.println("Length of Line 2: " + line2.getLength());

        if (line1.equals(line2)) {
            System.out.println("Both Lines are Equal");
        } else {
            int result = line1.compareTo(line2);

            if (result > 0) {
                System.out.println("Line 1 is Greater than Line 2");
            } else {
                System.out.println("Line 1 is Less than Line 2");
            }
        }
    }
}

