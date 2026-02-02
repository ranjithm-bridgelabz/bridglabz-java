package com.java.JavaRegex.UserRegistration;
import java.util.Scanner;
import java.util.regex.Pattern;
public class UserRegistration {

        /* UC1: First Name validation
           - First letter Capital
           - Minimum 3 characters */
        public static boolean validateFirstName(String firstName) {
            // ^[A-Z]  -> starts with capital letter
            // [a-z]{2,} -> at least 2 lowercase letters
            return Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
        }

        /* UC2: Last Name validation
           - Same rules as First Name */
        public static boolean validateLastName(String lastName) {
            return Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
        }

        /* UC3: Email validation
           - Mandatory parts: abc, bl, co
           - Optional parts: xyz, in */
        public static boolean validateEmail(String email) {
            return Pattern.matches(
                    "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2})?$",
                    email);
        }

        /* UC4: Mobile number validation
           - Country code (2 digits)
           - Space
           - 10 digit number */
        public static boolean validateMobile(String mobile) {
            return Pattern.matches("^[0-9]{2}\\s[0-9]{10}$", mobile);
        }

        /* UC5–UC8: Password validation
           UC5: Minimum 8 characters
           UC6: At least 1 uppercase letter
           UC7: At least 1 numeric digit
           UC8: Exactly 1 special character */
        public static boolean validatePassword(String password) {

            // (?=.*[A-Z]) → at least one uppercase
            // (?=.*[0-9]) → at least one digit
            // (?=.*[@#$%^&+=]) → at least one special character
            // {8,} → minimum 8 characters
            String passwordRegex =
                    "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=])[A-Za-z0-9@#$%^&+=]{8,}$";

            // Check exactly ONE special character
            boolean exactlyOneSpecial =
                    password.replaceAll("[^@#$%^&+=]", "").length() == 1;

            return Pattern.matches(passwordRegex, password) && exactlyOneSpecial;
        }

        public static void main(String[] args) {

            String firstName, lastName, email, mobile, password;

            /* Command Line Argument Logic */
            if (args.length == 5) {
                // Taking input from command line
                firstName = args[0];
                lastName = args[1];
                email = args[2];
                mobile = args[3];
                password = args[4];
            } else {
                // Taking input from user using Scanner
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter First Name: ");
                firstName = sc.nextLine();

                System.out.print("Enter Last Name: ");
                lastName = sc.nextLine();

                System.out.print("Enter Email: ");
                email = sc.nextLine();

                System.out.print("Enter Mobile Number: ");
                mobile = sc.nextLine();

                System.out.print("Enter Password: ");
                password = sc.nextLine();

                sc.close();
            }

            /* Printing Results */
            System.out.println("UC1 First Name: " +
                    (validateFirstName(firstName) ? "Valid" : "Invalid"));

            System.out.println("UC2 Last Name: " +
                    (validateLastName(lastName) ? "Valid" : "Invalid"));

            System.out.println("UC3 Email: " +
                    (validateEmail(email) ? "Valid" : "Invalid"));

            System.out.println("UC4 Mobile: " +
                    (validateMobile(mobile) ? "Valid" : "Invalid"));

            System.out.println("UC5–UC8 Password: " +
                    (validatePassword(password) ? "Valid" : "Invalid"));
        }


}
