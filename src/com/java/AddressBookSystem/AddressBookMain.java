package com.java.AddressBookSystem;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        System.out.println("Welcome to Address Book Program");

        while (true) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("First Name: ");
                    String firstName = scanner.nextLine();

                    System.out.print("Last Name: ");
                    String lastName = scanner.nextLine();

                    System.out.print("Address: ");
                    String address = scanner.nextLine();

                    System.out.print("City: ");
                    String city = scanner.nextLine();

                    System.out.print("State: ");
                    String state = scanner.nextLine();

                    System.out.print("Zip: ");
                    String zip = scanner.nextLine();

                    System.out.print("Phone Number: ");
                    String phone = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    Contact contact = new Contact(firstName, lastName, address,
                            city, state, zip, phone, email);

                    addressBook.addContact(contact);
                    break;

                case 2:
                    System.out.print("Enter First Name to Edit: ");
                    String editName = scanner.nextLine();

                    System.out.print("New Address: ");
                    address = scanner.nextLine();

                    System.out.print("New City: ");
                    city = scanner.nextLine();

                    System.out.print("New State: ");
                    state = scanner.nextLine();

                    System.out.print("New Zip: ");
                    zip = scanner.nextLine();

                    System.out.print("New Phone Number: ");
                    phone = scanner.nextLine();

                    System.out.print("New Email: ");
                    email = scanner.nextLine();

                    Contact updatedContact = new Contact(editName, "",
                            address, city, state, zip, phone, email);

                    addressBook.editContact(editName, updatedContact);
                    break;

                case 3:
                    System.out.print("Enter First Name to Delete: ");
                    String deleteName = scanner.nextLine();
                    addressBook.deleteContact(deleteName);
                    break;

                case 4:
                    addressBook.displayContacts();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
