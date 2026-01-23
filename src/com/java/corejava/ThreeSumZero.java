package com.java.corejava;

import java.util.Scanner;

public class ThreeSumZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N
        System.out.print("Enter number of elements (N): ");
        int N = scanner.nextInt();

        int[] arr = new int[N];

        // Read N integers
        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;

        System.out.println("Distinct triplets whose sum is zero:");

        // Cubic time logic: O(N^3)
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {

                    if (arr[i] + arr[j] + arr[k] == 0) {
                        count++;
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }

        // Output count
        System.out.println("Number of distinct triplets: " + count);

        scanner.close();
    }
}
