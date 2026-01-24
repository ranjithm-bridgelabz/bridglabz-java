package com.java.ProgrammingConstruct;


public class EmployeeWage {

    // CONSTANTS (as per PDF)
    public static final int IS_ABSENT = 0;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 8;   // PDF says 8

    public static final int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;

    // UC6: Calculate wage till condition
    public void calculateEmployeeWage() {

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        while (totalWorkingDays < MAX_WORKING_DAYS &&
                totalWorkingHours < MAX_WORKING_HOURS) {

            totalWorkingDays++;

            // UC1: Check attendance using RANDOM
            int empCheck = (int) (Math.random() * 3);
            int empHours = 0;

            // UC4: Switch Case
            switch (empCheck) {

                case IS_FULL_TIME:
                    empHours = FULL_DAY_HOUR;
                    System.out.println("Day " + totalWorkingDays +
                            ": Employee is Full Time");
                    break;

                case IS_PART_TIME:
                    empHours = PART_TIME_HOUR;
                    System.out.println("Day " + totalWorkingDays +
                            ": Employee is Part Time");
                    break;

                default:
                    empHours = 0;
                    System.out.println("Day " + totalWorkingDays +
                            ": Employee is Absent");
            }

            // UC2, UC3: Daily wage calculation
            int dailyWage = empHours * WAGE_PER_HOUR;

            totalWorkingHours += empHours;
            totalWage += dailyWage;
        }

        // UC5 + UC6 Output
        System.out.println("\nTotal Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Employee Wage: " + totalWage);
    }
}
