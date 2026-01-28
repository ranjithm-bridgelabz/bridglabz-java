package com.java.oopspracticeproblem.p3.EmployeeWage;



public interface IEmpWageBuilder {
    void addCompanyEmpWage(String company, int empRatePerHour,
                           int numOfWorkingDays, int maxHrsInMonth);
    void computeEmpWage();
    int getTotalWage(String company);
}
