package com.java.javaprogramming;

import java.util.Random;
import java.util.Scanner;

public class GamblingSimulator {

    private int initialStake;
    private int betAmount;
    private int totalDays;

    private int totalAmount = 0;
    private int winningDays = 0;
    private int losingDays = 0;

    private int luckiestDay = 0;
    private int unluckiestDay = 0;
    private int maxWin = Integer.MIN_VALUE;
    private int maxLoss = Integer.MAX_VALUE;

    private Random random = new Random();

    public static void main(String[] args) {
        GamblingSimulator simulator = new GamblingSimulator();
        simulator.readInput();
        simulator.startGambling();
        simulator.showMonthlyResult();
        simulator.showLuckiestAndUnluckiestDay();
        simulator.decideNextMonth();
    }

    private void readInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Initial Stake Amount: ");
        initialStake = scanner.nextInt();

        System.out.print("Enter Bet Amount: ");
        betAmount = scanner.nextInt();

        System.out.print("Enter Number of Days: ");
        totalDays = scanner.nextInt();
    }

    private void startGambling() {
        System.out.println("\n--- Gambling Started ---");

        for (int day = 1; day <= totalDays; day++) {
            int dayResult = playOneDay(day);
            totalAmount += dayResult;

            if (dayResult > 0) {
                winningDays++;
            } else {
                losingDays++;
            }

            if (dayResult > maxWin) {
                maxWin = dayResult;
                luckiestDay = day;
            }

            if (dayResult < maxLoss) {
                maxLoss = dayResult;
                unluckiestDay = day;
            }
        }
    }

    private int playOneDay(int day) {
        int stake = initialStake;
        int upperLimit = initialStake + (initialStake / 2);
        int lowerLimit = initialStake - (initialStake / 2);

        System.out.println("\nDay " + day + " Started with Stake: " + stake);

        while (stake > lowerLimit && stake < upperLimit) {
            stake = placeBet(stake);
        }

        int result = stake - initialStake;

        if (result > 0) {
            System.out.println("Day " + day + " Result: WON " + result);
        } else {
            System.out.println("Day " + day + " Result: LOST " + Math.abs(result));
        }

        System.out.println("---------------------------------");

        return result;
    }

    private int placeBet(int stake) {
        boolean win = random.nextBoolean();
        return win ? stake + betAmount : stake - betAmount;
    }

    private void showMonthlyResult() {
        System.out.println("\n--- Monthly Result ---");
        System.out.println("Total Amount Won/Lost after " + totalDays + " days: " + totalAmount);
        System.out.println("Winning Days: " + winningDays);
        System.out.println("Losing Days: " + losingDays);
    }

    private void showLuckiestAndUnluckiestDay() {
        System.out.println("\n--- Luckiest & Unluckiest Day ---");
        System.out.println("Luckiest Day: Day " + luckiestDay + " | Amount Won: " + maxWin);
        System.out.println("Unluckiest Day: Day " + unluckiestDay + " | Amount Lost: " + maxLoss);
    }

    private void decideNextMonth() {
        System.out.println("\n--- Next Month Decision ---");

        if (totalAmount > 0) {
            System.out.println("Gambler WON this month");
            System.out.println("Gambler will CONTINUE gambling next month");
        } else {
            System.out.println("Gambler LOST this month");
            System.out.println("Gambler will STOP gambling");
        }
    }
}

