package com.michaeljohare;

import java.util.Scanner;

public class GetUserInput {

    private Scanner userInput = new Scanner(System.in);
    private int userGuess = 0;
    private String userInputString = "";
    private final String askUserForGuess = "Please enter a guess (a whole number between 1 and 100) >>> ";
    private final String askUserForChoice = "CONGRATULATIONS, that's correct!  Play again? (Y/N) >>> ";

    private int checkForValidInput() {
        boolean isValidInput = false;
        while (!isValidInput && userInputString.isEmpty()) {
            System.out.print(askUserForGuess);
            try {
                this.userGuess = Integer.parseInt(userInput.nextLine());
                return this.userGuess;
            } catch (NumberFormatException e) {
                System.out.println("You did not enter a whole number, please try again.");
            }
            isValidInput = true;
        }
        return this.userGuess;
    }

    public boolean willContinuePlaying() {
        System.out.println();
        System.out.print(askUserForChoice);
        if (userInput.nextLine().equalsIgnoreCase("y")) {
            return false;
        }
        return true;
    }

    public int getUserGuess() {
        return checkForValidInput();
    }
}
