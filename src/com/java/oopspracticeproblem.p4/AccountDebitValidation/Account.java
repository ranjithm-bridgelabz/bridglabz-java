package com.java.oopspracticeproblem.p4.AccountDebitValidation;

public class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void debit(int amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance");
        } else {
            balance -= amount;
            System.out.println("Remaining Balance: " + balance);
        }
    }
}

