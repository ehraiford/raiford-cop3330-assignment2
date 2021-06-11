/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex32;

import java.util.Scanner;

public class solution32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Let's play Guess the Number!\n");


        while (true) {
            GuessingGame game = new GuessingGame();
            int difficulty = setDifficulty(in);
            game.correct = game.setCorrectNumber(difficulty);
            int guessed = 0;
            System.out.println("I have my number. What's your guess?");

            while (guessed != game.correct) {//while loop continues until guess is correct

                guessed = receiveInput(in);

                if (guessed < game.correct)
                    System.out.println("Too low. Guess again:");
                if (guessed > game.correct)
                    System.out.println("Too high. Guess again:");

                game.numGuesses++;
            }
            System.out.println("You got it in " + game.numGuesses + " guesses!");
            System.out.println("Do you wish to play again (Y/N)?");
            String playAgain = in.next();
            if(playAgain.compareTo("n") == 0 || playAgain.compareTo("N") == 0)
                break;
        }
    }

    private static int receiveInput(Scanner in) {
        int guess;
        String input = in.next();
        try{
            guess = Integer.parseInt(input);
        }catch(Exception e) {
            System.out.println("Guess must be a numeric value.");
            guess = -1;
        }
        return guess;
    }

    private static int setDifficulty(Scanner in) {
        int difficulty = 0;

        while(difficulty < 1 || difficulty > 3 ){
            System.out.println("Enter the difficulty level (1, 2, or 3):");
            try{
                difficulty = in.nextInt();
            }catch(Exception e){
                System.out.println("Input must be numeric.");
                in.next();
            }
        }
        return difficulty;
    }
}
