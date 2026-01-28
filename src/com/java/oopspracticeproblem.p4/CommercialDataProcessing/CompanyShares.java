package com.java.oopspracticeproblem.p4.CommercialDataProcessing;

import java.time.LocalDateTime;

public class CompanyShares {
    String symbol;
    int shares;
    LocalDateTime dateTime;

    public CompanyShares(String symbol, int shares) {
        this.symbol = symbol;
        this.shares = shares;
        this.dateTime = LocalDateTime.now();
    }
}
