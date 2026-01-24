package com.java.javafundamental.Employeewage;


import java.util.Scanner;

public class MonthlyEmployeeWageUC5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter wage per hour: ");
        int wagePerHour = sc.nextInt();

        System.out.print("Enter full day hours: ");
        int fullDayHour = sc.nextInt();

        System.out.print("Enter number of working days: ");
        int workingDays = sc.nextInt();

        int totalWage = 0;

        for (int day = 1; day <= workingDays; day++) {
            totalWage += wagePerHour * fullDayHour;
        }

        System.out.println("Total Monthly Employee Wage = " + totalWage);
    }
}
