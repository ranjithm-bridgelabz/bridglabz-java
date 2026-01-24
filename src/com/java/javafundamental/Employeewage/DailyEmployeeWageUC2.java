package com.java.javafundamental.Employeewage;

import java.util.Scanner;

public class DailyEmployeeWageUC2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter attendance (1 = Present, 0 = Absent): ");
        int empCheck = sc.nextInt();

        System.out.print("Enter wage per hour: ");
        int wagePerHour = sc.nextInt();

        System.out.print("Enter full day hours: ");
        int fullDayHour = sc.nextInt();

        int dailyWage = 0;

        if (empCheck == 1) {
            dailyWage = wagePerHour * fullDayHour;
        }

        System.out.println("Daily Employee Wage = " + dailyWage);
    }
}
