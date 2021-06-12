/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class solution35Test {

    @Test
    void add_contestant_puts_new_person_at_the_end(){
        ArrayList<String> contestants = new ArrayList<>();
        contestants.add("Gary");
        contestants.add("Lisa");
        contestants.add("Dora");
        solution35.addContestant("Jeremy", contestants);

        ArrayList<String> actual = new ArrayList<>();
        actual.add("Gary");
        actual.add("Lisa");
        actual.add("Dora");
        actual.add("Jeremy");
        assertEquals(contestants.toString(), actual.toString());
    }

    @Test
    void add_contestant_ignores_empty_inputs(){
        ArrayList<String> contestants = new ArrayList<>();
        contestants.add("Gary");
        contestants.add("Lisa");
        contestants.add("Dora");
        solution35.addContestant("", contestants);

        ArrayList<String> actual = new ArrayList<>();
        actual.add("Gary");
        actual.add("Lisa");
        actual.add("Dora");
        assertEquals(contestants.toString(), actual.toString());
    }

    @Test
    void winner_selection_returns_name_from_list(){
        ArrayList<String> contestants = new ArrayList<>();
        contestants.add("Gary");
        contestants.add("Lisa");
        contestants.add("Dora");
        String result = solution35.winnerSelection(contestants, 0);
        assertEquals("The winner is... Gary.", result);
    }
}