package com.java.oopsprogram;

import java.util.Scanner;

interface Calculator {
    void calculate();
}

public class Addition implements Calculator {
    public void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum: " + (a + b));
    }
}

