package com.java.oopspracticeproblem.p3.EmployeeWage;


import java.util.ArrayList;

public class CompanyEmpWage {

    public final String company;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maxHrsInMonth;

    public int totalEmpWage;
    public ArrayList<Integer> dailyWages = new ArrayList<>();

    public CompanyEmpWage(String company, int empRatePerHour,
                          int numOfWorkingDays, int maxHrsInMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHrsInMonth = maxHrsInMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    public int getTotalEmpWage() {
        return totalEmpWage;
    }
}
