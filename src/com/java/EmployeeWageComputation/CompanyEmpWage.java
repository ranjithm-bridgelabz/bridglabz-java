package com.java.EmployeeWageComputation;

public class CompanyEmpWage {

    public String company;
    public int wagePerHour;
    public int workingDays;
    public int maxHours;
    public int totalWage;

    public CompanyEmpWage(String company,
                          int wagePerHour,
                          int workingDays,
                          int maxHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.workingDays = workingDays;
        this.maxHours = maxHours;
    }
}
