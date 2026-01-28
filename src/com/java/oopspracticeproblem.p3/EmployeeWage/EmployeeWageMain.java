package com.java.oopspracticeproblem.p3.EmployeeWage;

public class EmployeeWageMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        IEmpWageBuilder empWageBuilder = new EmpWageBuilder();

        // UC8
        empWageBuilder.addCompanyEmpWage("TCS", 20, 20, 100);
        empWageBuilder.addCompanyEmpWage("Infosys", 25, 22, 110);

        // UC7–UC12
        empWageBuilder.computeEmpWage();

        // UC14
        System.out.println("Total Wage for TCS = "
                + empWageBuilder.getTotalWage("TCS"));
    }
}

