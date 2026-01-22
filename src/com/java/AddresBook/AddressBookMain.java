package com.java.AddresBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBookMain {

    static ArrayList<Contact> contactList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Add Contact
    public static void addContact() {

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Phone: ");
        String phone = sc.next();

        System.out.print("Enter City: ");
        String city = sc.next();

        contactList.add(new Contact(name, phone, city));
        System.out.println("Contact Added Successfully");
    }

    // Display Contacts
    public static void displayContacts() {

        if (contactList.isEmpty()) {
            System.out.println("Address Book is Empty");
            return;
        }

        for (Contact c : contactList) {
            System.out.println("Name: " + c.getName() +
                    ", Phone: " + c.getPhone() +
                    ", City: " + c.getCity());
        }
    }

    // Delete Contact
    public static void deleteContact() {

        System.out.print("Enter Name to Delete: ");
        String name = sc.next();

        Iterator<Contact> iterator = contactList.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Contact Deleted Successfully");
                return;
            }
        }

        System.out.println("Contact Not Found");
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n1.Add Contact  2.Display Contacts  3.Delete Contact  4.Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: addContact(); break;
                case 2: displayContacts(); break;
                case 3: deleteContact(); break;
                case 4:
                    System.out.println("Exiting Address Book");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}

