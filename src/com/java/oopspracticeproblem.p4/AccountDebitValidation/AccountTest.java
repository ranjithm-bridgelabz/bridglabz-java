package com.java.oopspracticeproblem.p4.AccountDebitValidation;

public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account(1000);
        account.debit(1200);
        account.debit(300);
    }
}
