package com.java.oopspracticeproblem.p3.AddressBook;


import java.util.HashMap;

public class AddressBookSystem {

    // UC5 & UC6: Dictionary of Address Books
    HashMap<String, AddressBook> addressBooks = new HashMap<>();

    public void addAddressBook(String name) {
        addressBooks.put(name, new AddressBook());
        System.out.println("Address Book Created: " + name);
    }

    public AddressBook getAddressBook(String name) {
        return addressBooks.get(name);
    }
}
