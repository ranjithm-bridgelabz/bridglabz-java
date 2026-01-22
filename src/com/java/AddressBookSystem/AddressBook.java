package com.java.AddressBookSystem;


import java.util.ArrayList;

public class AddressBook {

    // Collection to store contacts
    private ArrayList<Contact> contacts;

    // Constructor
    public AddressBook() {
        contacts = new ArrayList<>();
    }

    // UC1: Add Contact
    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully!");
    }

    // UC2: Edit Contact by First Name
    public void editContact(String firstName, Contact updatedContact) {

        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {

                contact.setAddress(updatedContact.getAddress());
                contact.setCity(updatedContact.getCity());
                contact.setState(updatedContact.getState());
                contact.setZip(updatedContact.getZip());
                contact.setPhoneNumber(updatedContact.getPhoneNumber());
                contact.setEmail(updatedContact.getEmail());

                System.out.println("Contact updated successfully!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }

    // UC3: Delete Contact by First Name
    public void deleteContact(String firstName) {

        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                contacts.remove(contact);
                System.out.println("Contact deleted successfully!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }

    // Display All Contacts
    public void displayContacts() {

        if (contacts.isEmpty()) {
            System.out.println("No contacts available!");
            return;
        }

        for (Contact contact : contacts) {
            contact.displayContact();
        }
    }
}

