/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex40;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class solution40Test {

    @Test
    void generateSpace_returns_string_with_proper_num_of_spaces(){
        String space = solution40.generateSpace("Gary Jennings");
        assertTrue(space.compareTo("           ") == 0);
    }

    @Test
    void generateSpace_returns_empty_string_with_too_large_String(){
        String space = solution40.generateSpace("This exercise was much easier than the last.");
        assertTrue(space.isEmpty());
    }

    @Test
    void confirmInstance_returns_false_when_instance_is_not_inside_names(){
        HashMap<String, String> xiong = new HashMap<>();
        xiong.put("First", "Tou");
        xiong.put("Last", "Xiong");
        xiong.put("Position", "Software Engineer");
        xiong.put("Separation", "2015-12-19");
        boolean response = solution40.confirmInstance("Jeremiah", xiong);
        assertFalse(response);
    }

    @Test
    void confirmInstance_returns_true_when_instance_is_inside_names(){
        HashMap<String, String> jacobson = new HashMap<>();
        jacobson.put("First", "Jake");
        jacobson.put("Last", "Jacobson");
        jacobson.put("Position", "Programmer");
        jacobson.put("Separation", "");
        boolean response = solution40.confirmInstance("Jacob", jacobson);
    }
}