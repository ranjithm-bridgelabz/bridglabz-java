package com.java.oopspracticeproblem.p4.StockManagementSystem;

import java.util.ArrayList;

public class StockPortfolio {

    ArrayList<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void printReport() {
        int totalValue = 0;
        for (Stock stock : stocks) {
            int value = stock.getValue();
            System.out.println(stock.name + " Value: " + value);
            totalValue += value;
        }
        System.out.println("Total Stock Value: " + totalValue);
    }
}
