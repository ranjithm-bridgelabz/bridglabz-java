package com.java.Exception.UserRegistrationException;

import java.util.Scanner;

public class UserRegistrationApp {

    public static void main(String[] args) {

        // ===== RULES FIRST =====
        System.out.println("===== USER REGISTRATION RULES =====");
        System.out.println("First Name : Capital letter, min 3 chars");
        System.out.println("Last Name  : Capital letter, min 3 chars");
        System.out.println("Email      : abc.xyz@bl.co.in");
        System.out.println("Mobile     : 91 9919819801");
        System.out.println("Password   : 8 chars, 1 Uppercase, 1 Number, 1 Special char");
        System.out.println("==================================");

        Scanner sc = new Scanner(System.in);

        try {
            // ===== USER INPUT =====
            System.out.print("Enter First Name: ");
            String firstName = sc.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Mobile: ");
            String mobile = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            // ===== UC1–UC8 VALIDATION =====
            UserRegistrationUtil.validateFirstName(firstName);
            UserRegistrationUtil.validateLastName(lastName);
            UserRegistrationUtil.validateEmail(email);
            UserRegistrationUtil.validateMobile(mobile);
            UserRegistrationUtil.validatePassword(password);

            System.out.println("✅ User Registered Successfully");

        } catch (UserRegistrationException e) {
            System.out.println("❌ Registration Failed: " + e.getMessage());
        }

        // ===== UC11 – EMAIL MULTIPLE TEST (NO PARAMETERIZED) =====
        System.out.println("\n===== EMAIL TEST CASES =====");

        String[] testEmails = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc@gmail.com.com",
                "abc@.com",
                "abc..2002@gmail.com"
        };

        for (String mail : testEmails) {
            try {
                UserRegistrationUtil.validateEmail(mail);
                System.out.println(mail + " -> VALID");
            } catch (UserRegistrationException e) {
                System.out.println(mail + " -> INVALID");
            }
        }

        sc.close();
    }
}

