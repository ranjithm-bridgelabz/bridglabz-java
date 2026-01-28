package com.java.DataStructureAlgorithm.RuntimeAnalysisandBigONotation;

import java.util.*;

public class SearchComparison {

    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);

        System.out.print("Enter search value: ");
        int key = sc.nextInt();

        System.out.println("Linear Search Index: " + linearSearch(arr, key));
        System.out.println("Binary Search Index: " + binarySearch(arr, key));
    }
}
