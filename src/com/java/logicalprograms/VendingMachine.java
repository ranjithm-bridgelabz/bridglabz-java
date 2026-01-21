package com.java.logicalprograms;

import java.util.Scanner;

public class VendingMachine {
    static int totalNotes = 0;

    // Available note denominations
    static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};

    // Recursive function to calculate minimum notes
    public static void calculateNotes(int amount, int index) {

        // Base condition
        if (amount == 0 || index == notes.length) {
            return;
        }

        // Check if current note can be used
        if (amount >= notes[index]) {
            int count = amount / notes[index];
            totalNotes += count;

            System.out.println(notes[index] + " Rs Notes : " + count);

            amount = amount % notes[index];
        }

        // Recursive call for next note
        calculateNotes(amount, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the change amount in Rs: ");
        int amount = sc.nextInt();

        System.out.println("Notes returned by Vending Machine:");
        calculateNotes(amount, 0);

        System.out.println("Minimum number of notes required: " + totalNotes);
    }
}
