package com.java.oopsprogram;
import java.util.Scanner;
public class Shape {
        void area() {
        }
    }

    class Circle extends Shape {
        void area() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Radius: ");
            double r = sc.nextDouble();
            System.out.println("Area of Circle: " + (3.14 * r * r));
        }
    }

    class Rectangle extends Shape {
        void area() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Length & Breadth: ");
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            System.out.println("Area of Rectangle: " + (l * b));
        }
    }


