package com.java.oopspracticeproblem.p4.CommercialDataProcessing;

public class StockAccountMain {
    public static void main(String[] args) {

        StockAccount account = new StockAccount();
        account.buy("TCS", 50);
        account.buy("INFY", 30);
        account.sell("TCS");
        account.printReport();
    }
}
