package com.java.oopspracticeproblem.p4.StockManagementSystem;

import java.util.Scanner;

public class StockMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StockPortfolio portfolio = new StockPortfolio();

        System.out.print("Enter number of stocks: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Stock Name: ");
            String name = sc.next();
            System.out.print("Shares: ");
            int shares = sc.nextInt();
            System.out.print("Price: ");
            int price = sc.nextInt();

            portfolio.addStock(new Stock(name, shares, price));
        }

        portfolio.printReport();
        sc.close();
    }
}
