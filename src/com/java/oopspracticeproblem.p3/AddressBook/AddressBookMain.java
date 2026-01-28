package com.java.oopspracticeproblem.p3.AddressBook;


import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner scanner = new Scanner(System.in);
        AddressBookSystem system = new AddressBookSystem();

        // UC5: Add new Address Book
        System.out.print("Enter Address Book Name: ");
        String bookName = scanner.nextLine();
        system.addAddressBook(bookName);

        AddressBook addressBook = system.getAddressBook(bookName);

        while (true) {
            System.out.println("\nChoose Option:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. View Contacts");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                // UC1 & UC4: Add multiple contacts
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
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    addressBook.addContact(new Contact(
                            firstName, lastName, address,
                            city, state, zip, phone, email
                    ));
                    break;

                // UC2
                case 2:
                    System.out.print("Enter First Name to Edit: ");
                    String editName = scanner.nextLine();
                    System.out.print("Enter New City: ");
                    String newCity = scanner.nextLine();
                    addressBook.editContact(editName, newCity);
                    break;

                // UC3
                case 3:
                    System.out.print("Enter First Name to Delete: ");
                    String deleteName = scanner.nextLine();
                    addressBook.deleteContact(deleteName);
                    break;

                case 4:
                    addressBook.viewContacts();
                    break;

                case 5:
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}

