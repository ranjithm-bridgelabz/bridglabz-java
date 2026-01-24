package com.java.ProgrammingConstruct.SnakeLadderProblem;

public class SnakeAndLadder {

    // Constants (PDF based)
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static final int WINNING_POSITION = 100;

    // UC1 → UC6
    public void playGame() {

        int playerPosition = 0;
        int diceCount = 0;

        System.out.println("Player starts at position 0");

        while (playerPosition < WINNING_POSITION) {

            // UC1: Roll Die (1 to 6)
            int dice = (int) (Math.random() * 6) + 1;
            diceCount++;

            // UC2: Check option (No Play, Ladder, Snake)
            int option = (int) (Math.random() * 3);

            switch (option) {

                case NO_PLAY:
                    // Player stays in same position
                    System.out.println("Dice: " + dice +
                            " | No Play | Position: " + playerPosition);
                    break;

                case LADDER:
                    // Player moves ahead
                    if (playerPosition + dice <= WINNING_POSITION) {
                        playerPosition += dice;
                    }
                    System.out.println("Dice: " + dice +
                            " | Ladder | Position: " + playerPosition);
                    break;

                case SNAKE:
                    // Player moves behind
                    playerPosition -= dice;
                    if (playerPosition < 0) {
                        playerPosition = 0;
                    }
                    System.out.println("Dice: " + dice +
                            " | Snake | Position: " + playerPosition);
                    break;
            }
        }

        // UC6: Report dice count
        System.out.println("\nPlayer won the game!");
        System.out.println("Total Dice Rolls: " + diceCount);
    }
}
