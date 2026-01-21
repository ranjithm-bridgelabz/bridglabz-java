package com.java.logicalprograms;

import java.util.Scanner;

public class ToBinary {

    public static String toBinary(int n) {

        StringBuilder binary = new StringBuilder();

        // Find highest power of 2 less than or equal to n
        int power = 1;
        while (power <= n) {
            power = power * 2;
        }
        power = power / 2;

        // Decompose number into powers of 2
        while (power > 0) {
            if (n >= power) {
                binary.append("1");
                n = n - power;
            } else {
                binary.append("0");
            }
            power = power / 2;
        }

        // Pad with leading zeros to make 32 bits (4 bytes)
        while (binary.length() < 32) {
            binary.insert(0, "0");
        }

        return binary.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        String result = toBinary(n);

        System.out.println("32-bit Binary Representation:");
        System.out.println(result);
    }
}
