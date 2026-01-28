package com.java.oopspracticeproblem.p3.AddressBook;


import java.util.ArrayList;

public class AddressBook {

    ArrayList<Contact> contacts = new ArrayList<>();

    // UC1 & UC4: Add contact
    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact Added Successfully");
    }

    // UC2: Edit contact using name
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

    // UC3: Delete contact using name
    public void deleteContact(String firstName) {
        boolean removed = contacts.removeIf(c -> c.firstName.equals(firstName));
        System.out.println(removed ? "Contact Deleted" : "Contact Not Found");
    }

    public void viewContacts() {
        for (Contact contact : contacts) {
            contact.display();
        }
    }
}

