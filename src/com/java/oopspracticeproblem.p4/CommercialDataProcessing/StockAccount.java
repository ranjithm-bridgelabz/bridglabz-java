package com.java.oopspracticeproblem.p4.CommercialDataProcessing;

import java.util.ArrayList;

public class StockAccount {

    ArrayList<CompanyShares> list = new ArrayList<>();

    public void buy(String symbol, int shares) {
        list.add(new CompanyShares(symbol, shares));
    }

    public void sell(String symbol) {
        list.removeIf(c -> c.symbol.equals(symbol));
    }

    public void printReport() {
        for (CompanyShares c : list) {
            System.out.println(c.symbol + " Shares: " + c.shares);
        }
    }
}

