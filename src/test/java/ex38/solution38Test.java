/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution38Test {

    @Test
    void filterEvenNumbers_returns_number_when_even(){
        assertTrue(solution38.filterEvenNumbers("8").compareTo(" 8") == 0);
    }

    @Test
    void filterEvenNumbers_returns_number_when_even_multiple_digit(){
       assertTrue(solution38.filterEvenNumbers("54").compareTo(" 54") == 0);
    }

    @Test
    void filterEvenNumbers_returns_empty_string_when_odd(){
        assertTrue(solution38.filterEvenNumbers("7").compareTo("") == 0);
    }

    @Test
    void filterEvenNumbers_returns_empty_string_when_odd_multiple_digit(){
        assertTrue(solution38.filterEvenNumbers("197").compareTo("") == 0);
    }
}