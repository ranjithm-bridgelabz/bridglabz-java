package com.java.oopsprogram;

import java.util.Scanner;

public class BankAccount {
    private double balance;

    void createAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();
        balance += amount;
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Withdraw Amount: ");
        double amount = sc.nextDouble();
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.createAccount();
        acc.deposit();
        acc.withdraw();
        acc.showBalance();
    }

}
