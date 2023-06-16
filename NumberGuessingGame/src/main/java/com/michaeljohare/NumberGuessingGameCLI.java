package com.michaeljohare;

public class NumberGuessingGameCLI {

    private NumberSelector numberSelector;
    private GetUserInput getUserInput;
    private CheckUserGuess checkUserGuess;
    int numberToGuess = 0;
    int userGuess = 0;
    public NumberGuessingGameCLI(NumberSelector numberSelector, GetUserInput getUserInput,
                                 CheckUserGuess checkUserGuess) {
        this.numberSelector = numberSelector;
        this.getUserInput = getUserInput;
        this.checkUserGuess = checkUserGuess;
    }

    public void run() {
        boolean isPlaying = false;

        while (!isPlaying) {
            numberToGuess = numberSelector.getNumberToGuess();
            while (userGuess != numberToGuess) {
                System.out.println();
                userGuess = getUserInput.getUserGuess();
                userGuess = checkUserGuess.checkUserGuess(numberToGuess, userGuess, getUserInput);
            }
            isPlaying = getUserInput.willContinuePlaying();
        }
    }


    public static void main(String[] args) {
        NumberSelector numberSelector = new NumberSelector();
        GetUserInput getUserInput = new GetUserInput();
        CheckUserGuess checkUserGuess = new CheckUserGuess();
        NumberGuessingGameCLI cli = new NumberGuessingGameCLI(numberSelector, getUserInput,checkUserGuess);
        cli.run();
    }
}