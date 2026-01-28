package com.java.oopspracticeproblem.p2.Addressbook;



import java.util.ArrayList;

public class AddressBook {

    ArrayList<Contact> contacts = new ArrayList<>();

    // UC1: Add contact
    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact Added Successfully");
    }

    // UC2: View contacts
    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available");
            return;
        }
        for (Contact contact : contacts) {
            contact.displayContact();
        }
    }

    // UC3: Edit contact using first name
    public void editContact(String firstName, String newCity) {
        for (Contact contact : contacts) {
            if (contact.firstName.equals(firstName)) {
                contact.city = newCity;
                System.out.println("Contact Updated");
                return;
            }
        }
        System.out.println("Contact Not Found");
    }

    // UC4: Delete contact using first name
    public void deleteContact(String firstName) {
        boolean removed = contacts.removeIf(c -> c.firstName.equals(firstName));
        if (removed) {
            System.out.println("Contact Deleted");
        } else {
            System.out.println("Contact Not Found");
        }
    }
}
