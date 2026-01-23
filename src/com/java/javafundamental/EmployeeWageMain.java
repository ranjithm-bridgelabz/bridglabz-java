package com.java.javafundamental;

import java.util.Scanner;

public class EmployeeWageMain {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Welcome to Employee Wage Computation Program");

            System.out.print("Enter Wage Per Hour: ");
            int wagePerHour = sc.nextInt();

            System.out.print("Enter Full Day Hours: ");
            int fullDayHours = sc.nextInt();

            System.out.print("Enter Part Time Hours: ");
            int partTimeHours = sc.nextInt();

            System.out.print("Enter Max Working Days per Month: ");
            int maxWorkingDays = sc.nextInt();

            System.out.print("Enter Max Working Hours per Month: ");
            int maxWorkingHours = sc.nextInt();

            EmployeeWageComputation emp = new EmployeeWageComputation(
                    wagePerHour,
                    fullDayHours,
                    partTimeHours,
                    maxWorkingDays,
                    maxWorkingHours
            );

            emp.calculateEmployeeWage();
            sc.close();
        }
    }
