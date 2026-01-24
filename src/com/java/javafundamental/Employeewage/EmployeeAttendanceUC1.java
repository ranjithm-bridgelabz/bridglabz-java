package com.java.javafundamental.Employeewage;

import java.util.Scanner;

public class EmployeeAttendanceUC1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.print("Enter employee attendance (1 = Present, 0 = Absent): ");
        int empCheck = sc.nextInt();

        if (empCheck == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}

