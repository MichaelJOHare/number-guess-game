package com.michaeljohare;

public class CheckUserGuess {
    private final String guessTooHigh = "Your guess was HIGHER than the correct answer. Try again!";
    private final String guessTooLow = "Your guess was LOWER than the correct answer. Try again!";
    private final String guessOutsideRange = "Your guess was not a whole number between 0 and 100, guess again " +
            "with a number inside of the specified range.";

    public int checkUserGuess(int numberToGuess, int userGuess, GetUserInput getUserInput) {
        while (userGuess != numberToGuess) {
            if (userGuess < 0 || userGuess > 100) {
                System.out.println();
                System.out.println(guessOutsideRange);
                System.out.println();
                break;
            }
            if (userGuess > numberToGuess) {
                    System.out.println();
                    System.out.println(guessTooHigh);
                    System.out.println();
                    userGuess = getUserInput.getUserGuess();
            }
            if (userGuess < numberToGuess) {
                    System.out.println();
                    System.out.println(guessTooLow);
                    System.out.println();
                    userGuess = getUserInput.getUserGuess();
            }
        }
        return userGuess;
    }
}
