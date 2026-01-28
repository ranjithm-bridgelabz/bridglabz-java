package com.java.oopspracticeproblem.p3.EmployeeWage;

import java.util.ArrayList;

public class EmpWageBuilder implements IEmpWageBuilder {

    // UC1–UC4 constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    // UC12: Use ArrayList
    private ArrayList<CompanyEmpWage> companyEmpWageList;

    public EmpWageBuilder() {
        companyEmpWageList = new ArrayList<>();
    }

    // UC8, UC9, UC10
    public void addCompanyEmpWage(String company, int empRatePerHour,
                                  int numOfWorkingDays, int maxHrsInMonth) {
        companyEmpWageList.add(
                new CompanyEmpWage(company, empRatePerHour,
                        numOfWorkingDays, maxHrsInMonth)
        );
    }

    // UC7, UC11, UC12
    public void computeEmpWage() {
        for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
            companyEmpWage.setTotalEmpWage(
                    computeEmpWage(companyEmpWage)
            );
            System.out.println("Total Employee Wage for "
                    + companyEmpWage.company + " = "
                    + companyEmpWage.totalEmpWage);
        }
    }

    // UC1 → UC6, UC13
    private int computeEmpWage(CompanyEmpWage companyEmpWage) {

        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        // UC6: Total hours or days condition
        while (totalEmpHrs <= companyEmpWage.maxHrsInMonth &&
                totalWorkingDays < companyEmpWage.numOfWorkingDays) {

            totalWorkingDays++;

            // UC1: Random attendance
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

            // UC4: Switch case
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8; // UC2
                    break;

                case IS_PART_TIME:
                    empHrs = 4; // UC3
                    break;

                default:
                    empHrs = 0;
            }

            totalEmpHrs += empHrs;

            // UC13: Store daily wage
            companyEmpWage.dailyWages
                    .add(empHrs * companyEmpWage.empRatePerHour);
        }

        // UC5: Monthly wage
        return totalEmpHrs * companyEmpWage.empRatePerHour;
    }

    // UC14: Get total wage by company
    public int getTotalWage(String company) {
        for (CompanyEmpWage empWage : companyEmpWageList) {
            if (empWage.company.equals(company)) {
                return empWage.getTotalEmpWage();
            }
        }
        return 0;
    }
}
