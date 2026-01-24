package com.java.corejava;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().charAt(0);

        // Convert to lowercase for uniform comparison
        ch = Character.toLowerCase(ch);

        // Check if input is an alphabet
        if (ch < 'a' || ch > 'z') {
            System.out.println("Invalid input. Please enter an alphabet.");
        }
        // Check vowel or consonant
        else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel.");
        } else {
            System.out.println(ch + " is a Consonant.");
        }

        scanner.close();
    }
}
