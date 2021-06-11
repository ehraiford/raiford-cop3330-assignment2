/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void targetRate_outputs_correctly(){
        Person target = new Person();
        target.age = 35;
        target.restingRate = 100;
        assertEquals(181, target.targetRate(95));
    }

    @Test
    void targetRate_outputs_correctly_when_rounding(){
        Person target = new Person();
        target.age = 22;
        target.restingRate = 65;
        assertEquals(145, target.targetRate(60));
    }

    @Test
    void targetRate_outputs_correctly_for_very_high_ages(){
        Person target = new Person();
        target.age = 118;
        target.restingRate = 100;
        assertEquals(102, target.targetRate(80));
    }
}