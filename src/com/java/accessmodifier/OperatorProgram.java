package com.java.accessmodifier;

import java.util.Scanner;

public class OperatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int r1 = a + b * c;
        int r2 = c + a / b;
        int r3 = a % b + c;
        int r4 = a * b + c;

        System.out.println("a + b * c = " + r1);
        System.out.println("c + a / b = " + r2);
        System.out.println("a % b + c = " + r3);
        System.out.println("a * b + c = " + r4);

        int max = Math.max(Math.max(r1, r2), Math.max(r3, r4));
        int min = Math.min(Math.min(r1, r2), Math.min(r3, r4));

        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);
    }
}
