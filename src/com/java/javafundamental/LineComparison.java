package com.java.javafundamental;

public class LineComparison {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        Line line1 = new Line(1, 2, 3, 4);
        Line line2 = new Line(2, 3, 4, 5);

        System.out.println("Length of Line 1: " + line1.getLength());
        System.out.println("Length of Line 2: " + line2.getLength());

        if (line1.equals(line2)) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Lines are not equal");
        }

        int comparisonResult = line1.compareTo(line2);

        if (comparisonResult == 0) {
            System.out.println("Line 1 is equal to Line 2");
        } else if (comparisonResult > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 1 is less than Line 2");
        }
    }
}
