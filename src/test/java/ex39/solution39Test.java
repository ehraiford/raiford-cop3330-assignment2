/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex39;

import ex40.solution40;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class solution39Test {

    @Test
    void generateSpace_returns_string_with_proper_num_of_spaces(){
        String space = solution39.generateSpace("Gary Jennings");
        assertTrue(space.compareTo("           ") == 0);
    }

    @Test
    void generateSpace_returns_empty_string_with_too_large_String(){
        String space = solution39.generateSpace("This exercise was much easier than the last.");
        assertTrue(space.isEmpty());
    }

    @Test
    void findHigher_returns_higher_of_two_options(){
        List<HashMap> employees = new ArrayList<>();
        employees = solution39.createArrayList(employees);

       assert
    }
}