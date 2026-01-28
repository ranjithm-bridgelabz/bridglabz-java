package com.java.oopspracticeproblem.p1.EmployeeWage;


public class EmployeeWageComputation {

    // UC7: Class variables
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // UC7: Calling class method
        computeEmployeeWage();
    }

    // UC7: Class method to compute employee wage
    public static void computeEmployeeWage() {

        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        // UC6: Calculate wage till total hours or days reached
        while (totalEmpHrs <= MAX_HRS_IN_MONTH &&
                totalWorkingDays < NUM_OF_WORKING_DAYS) {

            totalWorkingDays++;

            // UC1: Check employee attendance using Random
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

            // UC4: Solve using switch case
            switch (empCheck) {

                // UC2: Full time employee wage
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;

                // UC3: Part time employee wage
                case IS_PART_TIME:
                    empHrs = 4;
                    break;

                default:
                    empHrs = 0;
            }

            totalEmpHrs += empHrs;
        }

        // UC5: Calculate monthly employee wage
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Employee Wage: " + totalEmpWage);
    }
}

