package com.java.programmingconstruct;

import java.util.Scanner;

public class SnakeAndLadder {

    static final int WINNING_POSITION = 100;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int playersCount = sc.nextInt();

        int[] positions = new int[playersCount];
        int diceCount = 0;
        int currentPlayer = 0;

        System.out.println("\nGame Started!");
        System.out.println("Options: 0 = No Play, 1 = Ladder, 2 = Snake");

        while (true) {

            System.out.println("\nPlayer " + (currentPlayer + 1) + "'s turn");
            System.out.print("Press ENTER to roll the die...");
            sc.nextLine(); // consume leftover newline
            sc.nextLine();

            System.out.print("Enter dice value (1-6): ");
            int die = sc.nextInt();
            diceCount++;

            System.out.print("Enter option (0-No Play, 1-Ladder, 2-Snake): ");
            int option = sc.nextInt();

            int previousPosition = positions[currentPlayer];

            switch (option) {
                case 0:
                    System.out.println("No Play");
                    break;

                case 1:
                    System.out.println("Ladder");
                    positions[currentPlayer] += die;
                    break;

                case 2:
                    System.out.println("Snake");
                    positions[currentPlayer] -= die;
                    break;

                default:
                    System.out.println("Invalid option");
            }

            // Position below 0
            if (positions[currentPlayer] < 0) {
                positions[currentPlayer] = 0;
            }

            // Exact winning condition
            if (positions[currentPlayer] > WINNING_POSITION) {
                positions[currentPlayer] = previousPosition;
            }

            System.out.println("Player " + (currentPlayer + 1) +
                    " position: " + positions[currentPlayer]);

            // Winner check
            if (positions[currentPlayer] == WINNING_POSITION) {
                System.out.println("\n🎉 Player " + (currentPlayer + 1) + " Wins!");
                System.out.println("Total dice rolls: " + diceCount);
                break;
            }

            // Extra turn only if Ladder
            if (option != 1) {
                currentPlayer = (currentPlayer + 1) % playersCount;
            }
        }

        sc.close();
    }
    }



