package com.java.corejava;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

        // Read number of rows and columns
        writer.print("Enter number of rows (M): ");
        writer.flush();
        int M = scanner.nextInt();

        writer.print("Enter number of columns (N): ");
        writer.flush();
        int N = scanner.nextInt();

        // Create 2D array
        int[][] array = new int[M][N];

        // Read M x N elements
        writer.println("Enter " + (M * N) + " elements:");
        writer.flush();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Print 2D array
        writer.println("2D Array Output:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                writer.print(array[i][j] + " ");
            }
            writer.println();
        }

        writer.flush();
        scanner.close();
        writer.close();
    }
}
