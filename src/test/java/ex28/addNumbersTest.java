/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class addNumbersTest {

    @Test
   public void add_numbers_adds_correctly(){
        AddNumbers nums = new AddNumbers();
        assertEquals(10, nums.findNewTotal(7,3));
    }
    @Test
    public void add_numbers_adds_big_numbers_correctly(){
        AddNumbers num = new AddNumbers();
        assertEquals(85000, num.findNewTotal(8100, 76900));
    }
}