package com.java.oopspracticeproblem.p4.StockManagementSystem;

public class Stock {
    String name;
    int shares;
    int price;

    public Stock(String name, int shares, int price) {
        this.name = name;
        this.shares = shares;
        this.price = price;
    }

    public int getValue() {
        return shares * price;
    }
}
