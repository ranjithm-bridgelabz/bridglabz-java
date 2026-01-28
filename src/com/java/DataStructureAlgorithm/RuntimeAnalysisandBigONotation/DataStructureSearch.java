package com.java.DataStructureAlgorithm.RuntimeAnalysisandBigONotation;

import java.util.*;

public class DataStructureSearch {

    public static void main(String[] args) {

        int n = 100000;
        int key = 99999;

        int[] arr = new int[n];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i : arr) if (i == key) break;
        System.out.println("Array Search Time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        hashSet.contains(key);
        System.out.println("HashSet Search Time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        treeSet.contains(key);
        System.out.println("TreeSet Search Time: " + (System.currentTimeMillis() - start));
    }
}

