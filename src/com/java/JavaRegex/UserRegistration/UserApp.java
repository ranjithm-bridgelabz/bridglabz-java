package com.java.JavaRegex.UserRegistration;

import java.util.ArrayList;
import java.util.Scanner;

public class UserApp {

    static ArrayList<User> users = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Program start
        showRules();

        while (true) {
            System.out.println("\n===== USER MENU =====");
            System.out.println("1. Register User");
            System.out.println("2. View All Users");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> registerUser();
                case 2 -> viewUsers();
                case 3 -> updateUser();
                case 4 -> deleteUser();
                case 5 -> {
                    System.out.println("Thank You 🙏");
                    return;
                }
                default -> System.out.println("Invalid Choice");
            }
        }
    }

    // Rules explain
    static void showRules() {
        System.out.println("========== USER REGISTRATION RULES ==========");
        System.out.println("First Name: Capital letter, min 3 chars");
        System.out.println("Last Name : Capital letter, min 3 chars");
        System.out.println("Email     : abc.xyz@bl.co.in");
        System.out.println("Mobile    : 91 9919819801");
        System.out.println("Password  : 8 chars, 1 Uppercase, 1 Number, 1 Special char");
        System.out.println("============================================");
    }

    // CREATE
    // All UC validations
    static void registerUser() {

        System.out.print("First Name: ");
        String fn = sc.nextLine();

        System.out.print("Last Name: ");
        String ln = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Mobile: ");
        String mobile = sc.nextLine();

        System.out.print("Password: ");
        String pwd = sc.nextLine();

        if (UserRegistrationUtil.validateFirstName(fn) &&
                UserRegistrationUtil.validateLastName(ln) &&
                UserRegistrationUtil.validateEmail(email) &&
                UserRegistrationUtil.validateMobile(mobile) &&
                UserRegistrationUtil.validatePassword(pwd)) {

            users.add(new User(fn, ln, email, mobile, pwd));
            System.out.println("✅ User Registered Successfully");
        } else {
            System.out.println("❌ Registration Failed – Rules follow pannunga");
        }
    }

    // VIEW
    static void viewUsers() {
        if (users.isEmpty()) {
            System.out.println("No users found");
            return;
        }
        for (User u : users) {
            System.out.println(u.firstName + " " + u.lastName +
                    " | " + u.email + " | " + u.mobile);
        }
    }

    // UPDATE
    static void updateUser() {
        System.out.print("Enter Email to Update: ");
        String email = sc.nextLine();

        for (User u : users) {
            if (u.email.equals(email)) {
                System.out.print("New Mobile: ");
                String newMobile = sc.nextLine();

                if (UserRegistrationUtil.validateMobile(newMobile)) {
                    u.mobile = newMobile;
                    System.out.println("✅ User Updated Successfully");
                } else {
                    System.out.println("❌ Invalid Mobile Format");
                }
                return;
            }
        }
        System.out.println("User not found");
    }

    // DELETE
    static void deleteUser() {
        System.out.print("Enter Email to Delete: ");
        String email = sc.nextLine();

        users.removeIf(u -> u.email.equals(email));
        System.out.println("✅ User Deleted Successfully (if existed)");
    }
}

