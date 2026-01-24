package com.java.accessmodifier;

public class SpringSeason {
    public static void main(String[] args) {

        try {
            int m = Integer.parseInt(args[0]);
            int d = Integer.parseInt(args[1]);

            boolean isSpring =
                    (m == 3 && d >= 20) ||
                            (m == 4) ||
                            (m == 5) ||
                            (m == 6 && d <= 20);

            if (isSpring) {
                System.out.println("This is spring season");
            } else {
                System.out.println("This is not spring season");
            }

        } catch (Exception e) {
            // Handles missing arguments or invalid input
            System.out.println("This is not spring season");
        }
    }
}
