/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex33;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class solution33Test {
    @Test
    void getRandomNumber_returns_1_2_or_0(){
        solution33 instance = new solution33();
        int i = instance.getRandomNumber();
        System.out.println(i);
        assertTrue(i <=2 && i >=0);
    }
    @Test
    void getRandomNumber_returns_1_2_or_0_DuplicateTest(){
        solution33 instance = new solution33();
        int i = instance.getRandomNumber();
        System.out.println(i);
        assertTrue(i <=2 && i >=0);
    }

    @Test
    void generate_response_returns_yes_for_0(){
        List answers = new ArrayList();
        answers.add("Yes.");
        answers.add("No.");
        answers.add("Ask again later.");

        String answerChosen = solution33.generateResponse(0, answers);

        assertEquals(0,answerChosen.compareTo("Yes."));
    }

    @Test
    void generate_response_returns_no_for_1(){
        List answers = new ArrayList();
        answers.add("Yes.");
        answers.add("No.");
        answers.add("Ask again later.");

        String answerChosen = solution33.generateResponse(1, answers);

        assertEquals(0,answerChosen.compareTo("No."));
    }

    @Test
    void generate_response_returns_ask_again_later_for_2(){
        List answers = new ArrayList();
        answers.add("Yes.");
        answers.add("No.");
        answers.add("Ask again later.");

        String answerChosen = solution33.generateResponse(2, answers);

        assertEquals(0,answerChosen.compareTo("Ask again later."));
    }
}