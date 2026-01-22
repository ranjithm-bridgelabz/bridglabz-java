package com.java.oopsprogram;

import java.util.Scanner;

public class Student {

    int id;
    String name;
    int marks;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    void display() {
        System.out.println("\nStudent Details");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.getInput();
        s.display();
    }
}
