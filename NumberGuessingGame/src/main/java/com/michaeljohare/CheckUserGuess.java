package com.michaeljohare;

public class CheckUserGuess {
    private final String guessTooHigh = "Your guess was higher than the correct answer. Try again!";
    private final String guessTooLow = "Your guess was lower than the correct answer. Try again!";

    public int checkUserGuess(int numberToGuess, int userGuess, GetUserInput getUserInput) {
        while (userGuess != numberToGuess) {
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
