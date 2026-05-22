package main;

import service.EmployeePayrollDBService;

public class EmployeePayrollMain {

    public static void main(String[] args) {

        EmployeePayrollDBService service =
                new EmployeePayrollDBService();

        service.getConnection();
    }
}