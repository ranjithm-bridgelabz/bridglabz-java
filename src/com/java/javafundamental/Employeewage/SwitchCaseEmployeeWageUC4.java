package com.java.javafundamental.Employeewage;


import java.util.Scanner;

public class SwitchCaseEmployeeWageUC4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee type:");
        System.out.println("1 - Full Time");
        System.out.println("2 - Part Time");
        System.out.println("0 - Absent");

        int empType = sc.nextInt();

        int empHours = 0;
        int wagePerHour = 20;   // FIXED wage as per your requirement

        switch (empType) {

            case 1:
                empHours = 8;
                System.out.println("Employee is Full Time");
                break;

            case 2:
                empHours = 8;
                System.out.println("Employee is Part Time");
                break;

            case 0:
                System.out.println("Employee is Absent");
                return;   // 🔴 EXIT program immediately

            default:
                System.out.println("Invalid Employee Type");
                return;
        }

        int totalWage = empHours * wagePerHour;
        System.out.println("Total Working Hours = " + empHours);
        System.out.println("Employee Wage = " + totalWage);
    }
}
