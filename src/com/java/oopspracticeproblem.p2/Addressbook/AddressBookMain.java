package com.java.oopspracticeproblem.p2.Addressbook;




import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        // UC1: Add Contact First
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        System.out.print("Enter State: ");
        String state = scanner.nextLine();

        System.out.print("Enter Zip: ");
        String zip = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        Contact contact = new Contact(
                firstName, lastName, address,
                city, state, zip, phone, email
        );

        addressBook.addContact(contact);

        // Menu after adding contact
        while (true) {
            System.out.println("\nChoose Option:");
            System.out.println("1. View Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addressBook.viewContacts();
                    break;

                case 2:
                    System.out.print("Enter First Name to Edit: ");
                    String editName = scanner.nextLine();
                    System.out.print("Enter New City: ");
                    String newCity = scanner.nextLine();
                    addressBook.editContact(editName, newCity);
                    break;

                case 3:
                    System.out.print("Enter First Name to Delete: ");
                    String deleteName = scanner.nextLine();
                    addressBook.deleteContact(deleteName);
                    break;

                case 4:
                    System.out.println("Exiting Address Book");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
