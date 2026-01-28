package com.java.DataStructureAlgorithm.RuntimeAnalysisandBigONotation;

public class StringPerformance {

    public static void main(String[] args) {

        int n = 10000;

        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < n; i++) s += i;
        System.out.println("String Time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append(i);
        System.out.println("StringBuilder Time: " + (System.currentTimeMillis() - start));
    }
}

