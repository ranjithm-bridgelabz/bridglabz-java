package com.java.oopsprogram;

import java.util.Scanner;

public class ShapeDemo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("1.Circle 2.Rectangle: ");
            int choice = sc.nextInt();

            Shape s;
            if (choice == 1)
                s = new Circle();
            else
                s = new Rectangle();

            s.area();
        }
    }
