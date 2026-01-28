package com.java.JavaGenerics;

import java.util.Arrays;

public class MaximumFinder {

    // UC1–UC4: Generic method
    public static <T extends Comparable<T>> T testMaximum(T... values) {
        Arrays.sort(values);
        T max = values[values.length - 1];

        // UC5: Print max
        printMax(max);
        return max;
    }

    private static <T> void printMax(T max) {
        System.out.println("Maximum Value = " + max);
    }
}

