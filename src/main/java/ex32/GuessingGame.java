/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex32;

public class GuessingGame {
    int correct;
    int numGuesses;

    int setCorrectNumber(int difficulty){
        double correctAnswer = Math.random() * (Math.pow(10, difficulty) - 1) + 1;
        return ((int) correctAnswer);
    }
}
