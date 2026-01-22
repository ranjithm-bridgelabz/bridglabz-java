package com.java.EmployeeWageComputation;
import java.util.ArrayList;
import java.util.HashMap;

    public class EmployeeWageBuilder implements IEmployeeWage {

        private ArrayList<CompanyEmpWage> companyList;
        private HashMap<String, Integer> totalWageMap;

        public EmployeeWageBuilder() {
            companyList = new ArrayList<>();
            totalWageMap = new HashMap<>();
        }

        @Override
        public void addCompany(String company,
                               int wagePerHour,
                               int workingDays,
                               int maxHours) {

            CompanyEmpWage companyEmpWage =
                    new CompanyEmpWage(company, wagePerHour, workingDays, maxHours);

            companyList.add(companyEmpWage);
        }

        @Override
        public void computeEmployeeWage() {

            for (CompanyEmpWage company : companyList) {

                int totalHours = 0;
                int totalDays = 0;

                while (totalDays < company.workingDays &&
                        totalHours < company.maxHours) {

                    int empCheck = (int) (Math.random() * 3);
                    int hours = 0;

                    switch (empCheck) {
                        case 1:
                            hours = 8;
                            break;   // Full Time
                        case 2:
                            hours = 4;
                            break;   // Part Time
                        default:
                            hours = 0;         // Absent
                    }

                    totalHours += hours;
                    totalDays++;
                }

                company.totalWage = totalHours * company.wagePerHour;
                totalWageMap.put(company.company, company.totalWage);
            }
        }

        public void displayWages() {
            for (String company : totalWageMap.keySet()) {
                System.out.println("Company: " + company +
                        " | Total Employee Wage: " + totalWageMap.get(company));
            }

    }
}
