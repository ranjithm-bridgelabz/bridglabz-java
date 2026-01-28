package com.java.oopspracticeproblem.p2.EmployeeWage;


public class EmployeeWageComputation {

    // UC7: Class variables
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // UC8: Compute wage for multiple companies
        computeEmployeeWage("TCS", 20, 20, 100);
        computeEmployeeWage("Infosys", 25, 22, 110);
    }

    // UC7 & UC8: Class method with parameters
    public static void computeEmployeeWage(String company,
                                           int empRatePerHour,
                                           int numOfWorkingDays,
                                           int maxHrsInMonth) {

        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        // UC6: Calculate wage till total hours or days reached
        while (totalEmpHrs <= maxHrsInMonth &&
                totalWorkingDays < numOfWorkingDays) {

            totalWorkingDays++;

            // UC1: Check employee attendance using Random
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

            // UC4: Solve using switch case
            switch (empCheck) {

                // UC2: Full-time employee
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;

                // UC3: Part-time employee
                case IS_PART_TIME:
                    empHrs = 4;
                    break;

                default:
                    empHrs = 0;
            }

            totalEmpHrs += empHrs;
        }

        // UC5: Calculate monthly wage
        int totalEmpWage = totalEmpHrs * empRatePerHour;

        System.out.println("Total Employee Wage for "
                + company + " : " + totalEmpWage);
    }
}
