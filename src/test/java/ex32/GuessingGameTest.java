/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessingGameTest {

    @Test
    void set_diffictuly_within_range_dificulty_1(){
        GuessingGame game = new GuessingGame();
        game.correct = game.setCorrectNumber(1);
        System.out.println("Difficulty 1 (should be 10 or under): " + game.correct);
        assertTrue( game.correct <=10 && game.correct > 0);
    }

    @Test
    void set_diffictuly_within_range_dificulty_2(){
        GuessingGame game = new GuessingGame();
        game.correct = game.setCorrectNumber(2);
        System.out.println("Difficulty 2 (should be 100 or under): " + game.correct);
        assertTrue( game.correct <=100 && game.correct > 0);
    }

    @Test
    void set_diffictuly_within_range_dificulty_3(){
        GuessingGame game = new GuessingGame();
        game.correct = game.setCorrectNumber(3);
        System.out.println("Difficulty 3 (should be 1000 or under): " + game.correct);
        assertTrue( game.correct <=1000 && game.correct > 0);
    }
}