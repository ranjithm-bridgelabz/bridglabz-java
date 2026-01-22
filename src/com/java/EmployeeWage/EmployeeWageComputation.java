package com.java.EmployeeWage;

import java.util.Random;

class EmployeeWage {

    // Class variables
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;

    // Method to compute employee wage
    public static void computeEmployeeWage(
            String company,
            int wagePerHour,
            int maxWorkingDays,
            int maxWorkingHours) {

        int empHours = 0;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;

        Random random = new Random();

        // UC6: Calculate wages till condition of hours or days is reached
        while (totalEmpHours < maxWorkingHours &&
                totalWorkingDays < maxWorkingDays) {

            totalWorkingDays++;

            // UC1: Check employee attendance
            int empCheck = random.nextInt(3);

            // UC4: Switch Case
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHours = 8;
                    break;

                case IS_PART_TIME:
                    empHours = 4;
                    break;

                default:
                    empHours = 0;
            }

            totalEmpHours += empHours;

            // UC2: Calculate daily wage
            int dailyWage = empHours * wagePerHour;

            System.out.println("Day " + totalWorkingDays +
                    " Employee Hours: " + empHours +
                    " Daily Wage: " + dailyWage);
        }

        // UC5: Monthly wage
        int totalWage = totalEmpHours * wagePerHour;

        System.out.println("--------------------------------");
        System.out.println("Company: " + company);
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalEmpHours);
        System.out.println("Total Monthly Wage: " + totalWage);
        System.out.println("--------------------------------\n");
    }
}

public class EmployeeWageComputation {

    public static void main(String[] args) {

        // UC0: Welcome message
        System.out.println("Welcome to Employee Wage Computation Program");

        // UC8: Compute wage for multiple companies
        EmployeeWage.computeEmployeeWage(
                "TCS",        // Company Name
                20,           // Wage per Hour
                20,           // Working Days
                100           // Working Hours
        );

        EmployeeWage.computeEmployeeWage(
                "INFOSYS",
                25,
                22,
                110
        );
    }
}

