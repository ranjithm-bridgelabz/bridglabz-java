package com.java.oopsprogram;

import java.util.Scanner;

public class Encapsulation {

    private int empId;
    private String empName;
    private double basicSalary;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }

    public void calculateSalary() {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double total = basicSalary + hra + da;
        System.out.println("Total Salary: " + total);
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.input();
        e.calculateSalary();
    }
}
