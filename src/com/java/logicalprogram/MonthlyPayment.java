package com.java.logicalprogram;

import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal (P): ");
        double P = sc.nextDouble();

        System.out.print("Enter Years (Y): ");
        int Y = sc.nextInt();

        System.out.print("Enter Rate of Interest (R): ");
        double R = sc.nextDouble();

        double payment = Util.monthlyPayment(P, Y, R);

        System.out.println("Monthly Payment = " + payment);
    }
}
