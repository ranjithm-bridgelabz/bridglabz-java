package com.java.javafundamental;

import java.util.Random;

public class EmployeeWageComputation {
        // Constants
        public static final int IS_ABSENT = 0;
        public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;

        int wagePerHour;
        int fullDayHours;
        int partTimeHours;
        int maxWorkingDays;
        int maxWorkingHours;

    EmployeeWageComputation(int wagePerHour, int fullDayHours, int partTimeHours,
                     int maxWorkingDays, int maxWorkingHours) {
            this.wagePerHour = wagePerHour;
            this.fullDayHours = fullDayHours;
            this.partTimeHours = partTimeHours;
            this.maxWorkingDays = maxWorkingDays;
            this.maxWorkingHours = maxWorkingHours;
        }

        public void calculateEmployeeWage() {
            int totalWorkingHours = 0;
            int totalWorkingDays = 0;
            int totalWage = 0;

            Random random = new Random();

            while (totalWorkingDays < maxWorkingDays &&
                    totalWorkingHours < maxWorkingHours) {

                totalWorkingDays++;

                int empCheck = random.nextInt(3);
                int empHours = 0;

                switch (empCheck) {
                    case IS_FULL_TIME:
                        empHours = fullDayHours;
                        System.out.println("Day " + totalWorkingDays + ": Full Time");
                        break;

                    case IS_PART_TIME:
                        empHours = partTimeHours;
                        System.out.println("Day " + totalWorkingDays + ": Part Time");
                        break;

                    default:
                        empHours = 0;
                        System.out.println("Day " + totalWorkingDays + ": Absent");
                }

                if (totalWorkingHours + empHours > maxWorkingHours) {
                    empHours = maxWorkingHours - totalWorkingHours;
                }

                totalWorkingHours += empHours;
                int dailyWage = empHours * wagePerHour;
                totalWage += dailyWage;

                System.out.println("Daily Wage: " + dailyWage);
                System.out.println("----------------------------");
            }

            System.out.println("Total Working Days: " + totalWorkingDays);
            System.out.println("Total Working Hours: " + totalWorkingHours);
            System.out.println("Total Employee Wage: " + totalWage);
        }
    }

