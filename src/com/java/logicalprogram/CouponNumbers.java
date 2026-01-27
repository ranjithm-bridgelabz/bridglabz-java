package com.java.logicalprogram;

import java.util.Scanner;

public class CouponNumbers {

    // Static function to generate random number between 0 and n-1
    public static int getRandomCoupon(int n) {
        return (int) (Math.random() * n);
    }

    // Static function to count total random numbers needed
    public static int collectCoupons(int n) {
        boolean[] isCollected = new boolean[n];
        int distinctCount = 0;
        int totalRandomNumbers = 0;

        while (distinctCount < n) {
            int coupon = getRandomCoupon(n);
            totalRandomNumbers++;

            // Check if coupon is new
            if (!isCollected[coupon]) {
                isCollected[coupon] = true;
                distinctCount++;
            }
        }
        return totalRandomNumbers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of distinct coupons: ");
        int n = sc.nextInt();

        int result = collectCoupons(n);

        System.out.println("Total random numbers needed: " + result);
    }
}
