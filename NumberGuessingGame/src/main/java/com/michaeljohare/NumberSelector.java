package com.michaeljohare;

import java.util.Random;

public class NumberSelector {

    private int numberToGuess = 0;

    public int getNumberToGuess() {
        setNumberToGuess();
        return numberToGuess;
    }

    private void setNumberToGuess() {
        Random randomNumber = new Random();
        int upperBound = 101;
        this.numberToGuess = randomNumber.nextInt(upperBound);
    }
}
