package com.java.EmployeeWageComputation;

public interface IEmployeeWage {
    void addCompany(String company,
                    int wagePerHour,
                    int workingDays,
                    int maxHours);

    void computeEmployeeWage();
}
