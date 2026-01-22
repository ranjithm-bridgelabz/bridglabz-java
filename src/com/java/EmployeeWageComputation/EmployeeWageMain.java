package com.java.EmployeeWageComputation;

import java.util.Scanner;

public class EmployeeWageMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeWageBuilder builder = new EmployeeWageBuilder();

        System.out.print("Enter number of companies: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter details for Company " + i);

            System.out.print("Company Name: ");
            String company = sc.nextLine(); // FIXED

            System.out.print("Wage Per Hour: ");
            int wagePerHour = sc.nextInt();

            System.out.print("Working Days: ");
            int workingDays = sc.nextInt();

            System.out.print("Max Working Hours: ");
            int maxHours = sc.nextInt();
            sc.nextLine(); // clear buffer

            builder.addCompany(company, wagePerHour, workingDays, maxHours);
        }

        builder.computeEmployeeWage();
        builder.displayWages();

        sc.close();
    }
}
