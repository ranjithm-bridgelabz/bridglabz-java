package com.java.javafundamental.Employeewage;

import java.util.Scanner;

public class WageTillConditionUC6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter wage per hour: ");
        int wagePerHour = sc.nextInt();

        System.out.print("Enter max working days: ");
        int maxDays = sc.nextInt();

        System.out.print("Enter max working hours: ");
        int maxHours = sc.nextInt();

        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        while (totalDays < maxDays && totalHours < maxHours) {

            System.out.print("Enter employee type (1 = Full Time, 2 = Part Time, 0 = Absent): ");
            int empType = sc.nextInt();

            int empHours = 0;

            switch (empType) {
                case 1:
                    empHours = 8;
                    break;
                case 2:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }

            totalHours += empHours;
            totalWage += empHours * wagePerHour;
            totalDays++;
        }

        System.out.println("Total Days Worked = " + totalDays);
        System.out.println("Total Hours Worked = " + totalHours);
        System.out.println("Total Employee Wage = " + totalWage);
    }
}

