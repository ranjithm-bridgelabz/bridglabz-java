package com.java.javafundamental;

import java.util.Random;

public class EmployeeWage {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int EMP_RATE_PER_HOUR = 20;
        public static final int NUM_OF_WORKING_DAYS = 20;
        public static final int MAX_HRS_IN_MONTH = 100;

        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        public void checkAttendance() {
            Random random = new Random();
            int empCheck = random.nextInt(2);

            if (empCheck == 1)
                System.out.println("Employee is Present");
            else
                System.out.println("Employee is Absent");
        }

        // UC2: Daily Employee Wage
        public void calculateDailyWage() {
            empHrs = 8;
            int dailyWage = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("Daily Employee Wage: " + dailyWage);
        }
        public void calculateWageUsingSwitch() {
            Random random = new Random();
            int empCheck = random.nextInt(3);

            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    System.out.println("Employee is Part Time");
                    break;

                case IS_FULL_TIME:
                    empHrs = 8;
                    System.out.println("Employee is Full Time");
                    break;

                default:
                    empHrs = 0;
                    System.out.println("Employee is Absent");
            }

            int wage = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("Wage: " + wage);
        }
        public void calculateMonthlyWage() {
            while (totalEmpHrs < MAX_HRS_IN_MONTH &&
                    totalWorkingDays < NUM_OF_WORKING_DAYS) {

                totalWorkingDays++;
                Random random = new Random();
                int empCheck = random.nextInt(3);

                switch (empCheck) {
                    case IS_PART_TIME:
                        empHrs = 4;
                        break;

                    case IS_FULL_TIME:
                        empHrs = 8;
                        break;

                    default:
                        empHrs = 0;
                }

                totalEmpHrs += empHrs;
            }

            int totalWage = totalEmpHrs * EMP_RATE_PER_HOUR;
            System.out.println("Total Working Days: " + totalWorkingDays);
            System.out.println("Total Working Hours: " + totalEmpHrs);
            System.out.println("Total Monthly Wage: " + totalWage);
        }

        public static void main(String[] args) {

            System.out.println("Welcome to Employee Wage Computation Program");

            EmployeeWage empWage = new EmployeeWage();

            empWage.checkAttendance();
            empWage.calculateDailyWage();
            empWage.calculateWageUsingSwitch();
            empWage.calculateMonthlyWage();

            System.out.println("Thank You");
        }
    }


