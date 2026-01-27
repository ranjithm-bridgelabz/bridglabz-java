package com.java.logicalprogramming;

import java.util.Scanner;

public class Binary {

    public static String toBinary(int n) {
        StringBuilder binary = new StringBuilder();

        for (int i = 7; i >= 0; i--) {
            int bit = (n >> i) & 1;
            binary.append(bit);
        }
        return binary.toString();
    }

    // Static function to swap nibbles
    public static int swapNibbles(int n) {
        return ((n & 0x0F) << 4) | ((n & 0xF0) >> 4);
    }

    // Static function to check power of 2
    public static boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer (0–255): ");
        int n = sc.nextInt();

        // Step 1: Convert to binary
        String binary = toBinary(n);
        System.out.println("Binary (8-bit): " + binary);

        // Step 2: Swap nibbles
        int swapped = swapNibbles(n);
        String swappedBinary = toBinary(swapped);

        System.out.println("After swapping nibbles:");
        System.out.println("Binary: " + swappedBinary);
        System.out.println("Decimal: " + swapped);

        // Step 3: Check power of 2
        if (isPowerOfTwo(swapped)) {
            System.out.println("Resultant number is a Power of 2");
        } else {
            System.out.println("Resultant number is NOT a Power of 2");
        }
    }
}
