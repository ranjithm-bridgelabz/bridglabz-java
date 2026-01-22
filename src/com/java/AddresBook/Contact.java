package com.java.AddresBook;


public class Contact {

    private String name;
    private String phone;
    private String city;

    public Contact(String name, String phone, String city) {
        this.name = name;
        this.phone = phone;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }
}

