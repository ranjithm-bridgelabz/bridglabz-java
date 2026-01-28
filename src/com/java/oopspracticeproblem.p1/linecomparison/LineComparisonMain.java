package com.java.oopspracticeproblem.p1.linecomparison;


public class LineComparisonMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        Line line1 = new Line(1, 2, 4, 6);
        Line line2 = new Line(2, 3, 6, 7);

        double length1 = line1.length();
        double length2 = line2.length();

        System.out.println("Line 1 Length: " + length1);
        System.out.println("Line 2 Length: " + length2);

        if (line1.equals(line2)) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Lines are not equal");
        }

        int comparison = line1.compareTo(line2);

        if (comparison == 0) {
            System.out.println("Both lines are equal in length");
        } else if (comparison > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 1 is less than Line 2");
        }
    }
}

