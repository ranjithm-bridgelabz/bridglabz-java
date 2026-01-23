package com.java.practiceproblem;

public class Distance {

    public static void main(String[] args) {

        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            System.out.println("Euclidean Distance = " + distance);

        } catch (Exception e) {
            System.out.println("Invalid input. Please provide x and y values.");
        }
    }
}
