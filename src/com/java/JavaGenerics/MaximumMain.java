package com.java.JavaGenerics;


public class MaximumMain {

    public static void main(String[] args) {

        System.out.println("Find Maximum Problem Using Generics");

        // =========================
        // UC1 – INTEGER TEST CASES
        // =========================

        System.out.println("\nTC 1.1: Max at 1st Position");
        MaximumFinder.testMaximum(30, 20, 10);

        System.out.println("\nTC 1.2: Max at 2nd Position");
        MaximumFinder.testMaximum(10, 30, 20);

        System.out.println("\nTC 1.3: Max at 3rd Position");
        MaximumFinder.testMaximum(10, 20, 30);

        // =========================
        // UC2 – FLOAT TEST CASES
        // =========================

        System.out.println("\nTC 2.1: Float Max at 1st Position");
        MaximumFinder.testMaximum(3.3f, 2.2f, 1.1f);

        System.out.println("\nTC 2.2: Float Max at 2nd Position");
        MaximumFinder.testMaximum(1.1f, 3.3f, 2.2f);

        System.out.println("\nTC 2.3: Float Max at 3rd Position");
        MaximumFinder.testMaximum(1.1f, 2.2f, 3.3f);

        // =========================
        // UC3 – STRING TEST CASES
        // =========================

        System.out.println("\nTC 3.1: String Max at 1st Position");
        MaximumFinder.testMaximum("Peach", "Apple", "Banana");

        System.out.println("\nTC 3.2: String Max at 2nd Position");
        MaximumFinder.testMaximum("Apple", "Peach", "Banana");

        System.out.println("\nTC 3.3: String Max at 3rd Position");
        MaximumFinder.testMaximum("Apple", "Banana", "Peach");

        // =========================
        // REFACTOR 2 – GENERIC CLASS
        // =========================

        System.out.println("\nRefactor 2: Generic Class Test");
        GenericMaximum<Integer> genericMax =
                new GenericMaximum<>(10, 20, 30);
        genericMax.testMaximum();

        // =========================
        // UC4 – MORE THAN 3 VALUES
        // =========================

        System.out.println("\nUC4: More than 3 Integers");
        MaximumFinder.testMaximum(5, 10, 20, 15, 30, 25);
    }
}
