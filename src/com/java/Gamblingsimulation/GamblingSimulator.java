package com.java.Gamblingsimulation;

import java.util.Random;

public class GamblingSimulator {

    static final int INITIAL_STAKE = 100;
    static final int BET_AMOUNT = 1;
    static final int DAYS_IN_MONTH = 20;

    Random random = new Random();

    // UC1 & UC2: Play one day
    public int playOneDay() {
        int stake = INITIAL_STAKE;

        while (stake > 50 && stake < 150) {
            if (random.nextBoolean()) {
                stake += BET_AMOUNT;   // Win
            } else {
                stake -= BET_AMOUNT;   // Lose
            }
        }
        return stake - INITIAL_STAKE; // Profit or Loss for the day
    }

    // UC3 & UC4: Play for 20 days
    public int[] playOneMonth() {
        int[] dailyResults = new int[DAYS_IN_MONTH];

        for (int day = 0; day < DAYS_IN_MONTH; day++) {
            dailyResults[day] = playOneDay();
        }
        return dailyResults;
    }

    // UC5: Calculate total amount won or lost
    public int calculateMonthlyTotal(int[] results) {
        int total = 0;
        for (int value : results) {
            total += value;
        }
        return total;
    }

    // UC6: Find luckiest and unluckiest day
    public void findLuckiestAndUnluckiestDay(int[] results) {
        int luckiestDay = 0;
        int unluckiestDay = 0;

        for (int i = 1; i < results.length; i++) {
            if (results[i] > results[luckiestDay]) {
                luckiestDay = i;
            }
            if (results[i] < results[unluckiestDay]) {
                unluckiestDay = i;
            }
        }

        System.out.println("Luckiest Day: Day " + (luckiestDay + 1)
                + " Profit: $" + results[luckiestDay]);

        System.out.println("Unluckiest Day: Day " + (unluckiestDay + 1)
                + " Loss: $" + results[unluckiestDay]);
    }

    // UC7: Decide whether to continue next month
    public boolean shouldContinueGambling(int monthlyTotal) {
        return monthlyTotal > 0;
    }

    // Main Method
    public static void main(String[] args) {

        GamblingSimulator simulator = new GamblingSimulator();

        int[] monthlyResults = simulator.playOneMonth();

        int monthlyTotal = simulator.calculateMonthlyTotal(monthlyResults);

        System.out.println("Total Amount Won/Lost in Month: $" + monthlyTotal);

        simulator.findLuckiestAndUnluckiestDay(monthlyResults);

        if (simulator.shouldContinueGambling(monthlyTotal)) {
            System.out.println("Gambler decides to CONTINUE gambling next month.");
        } else {
            System.out.println("Gambler decides to STOP gambling.");
        }
    }
}
