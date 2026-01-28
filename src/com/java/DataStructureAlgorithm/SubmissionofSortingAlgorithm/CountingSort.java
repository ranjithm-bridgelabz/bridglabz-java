package com.java.DataStructureAlgorithm.SubmissionofSortingAlgorithm;

import java.util.Scanner;

public class CountingSort {

    public static void countingSort(int[] arr, int max) {
        int[] count = new int[max + 1];

        for (int num : arr)
            count[num]++;

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i]-- > 0) {
                arr[index++] = i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        int[] ages = new int[n];
        System.out.println("Enter student ages (10 to 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        countingSort(ages, 18);

        System.out.println("Sorted Student Ages:");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
