package com.java.oopsprogram;

import java.util.Scanner;

public class Inheritance {

    String name;

    void inputPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }
}

class Employee extends Inheritance {
    int empId;

    void inputEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.inputPerson();
        e.inputEmployee();
        e.display();
    }
}
