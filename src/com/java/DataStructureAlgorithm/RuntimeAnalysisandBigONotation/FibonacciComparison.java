package com.java.DataStructureAlgorithm.RuntimeAnalysisandBigONotation;

import java.util.Scanner;

public class FibonacciComparison {

    static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    static int fibIterative(int n) {
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Recursive Fibonacci: " + fibRecursive(n));
        System.out.println("Iterative Fibonacci: " + fibIterative(n));
    }
}

