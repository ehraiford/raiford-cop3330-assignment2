/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberSetTest {

    @Test
    void calculate_average_gives_average_from_ex(){
        NumberSet list = new NumberSet();
        list.setNumber(100);
        list.setNumber(200);
        list.setNumber(1000);
        list.setNumber(300);
        list.calculateStats();

        assertEquals(400, list.getAverage());
    }

    @Test
    void calculate_maximum_gives_answer_from_ex(){
        NumberSet list = new NumberSet();
        list.setNumber(100);
        list.setNumber(200);
        list.setNumber(1000);
        list.setNumber(300);
        list.calculateStats();

        assertEquals(1000, list.getMax());
    }

    @Test
    void get_min_gives_answer_from_ex(){
        NumberSet list = new NumberSet();
        list.setNumber(100);
        list.setNumber(200);
        list.setNumber(1000);
        list.setNumber(300);
        list.calculateStats();

        assertEquals(100, list.getMin());
    }

    @Test
    void get_deviation_gives_answer_from_ex(){
        NumberSet list = new NumberSet();
        list.setNumber(100);
        list.setNumber(200);
        list.setNumber(1000);
        list.setNumber(300);
        list.calculateStats();

        assertEquals(353.55, list.getDeviation());
    }

    @Test
    void calculate_average_handles_large_inputs(){
        NumberSet list = new NumberSet();
        list.setNumber(3);
        list.setNumber(12);
        list.setNumber(10200);
        list.setNumber(32);
        list.setNumber(17);
        list.setNumber(856);
        list.setNumber(4920);
        list.setNumber(33);
        list.setNumber(16);
        list.setNumber(8675309);
        list.setNumber(34787);
        list.setNumber(1);
        list.calculateStats();

        assertEquals(727182.17, list.getAverage());
    }

    @Test
    void calculate_maximum_handles_large_inputs(){
        NumberSet list = new NumberSet();
        list.setNumber(3);
        list.setNumber(12);
        list.setNumber(10200);
        list.setNumber(32);
        list.setNumber(17);
        list.setNumber(856);
        list.setNumber(4920);
        list.setNumber(33);
        list.setNumber(16);
        list.setNumber(8675309);
        list.setNumber(34787);
        list.setNumber(1);
        list.calculateStats();

        assertEquals(8675309, list.getMax());
    }

    @Test
    void calculate_min_handles_large_inputs(){
        NumberSet list = new NumberSet();
        list.setNumber(3);
        list.setNumber(12);
        list.setNumber(10200);
        list.setNumber(32);
        list.setNumber(17);
        list.setNumber(856);
        list.setNumber(4920);
        list.setNumber(33);
        list.setNumber(16);
        list.setNumber(8675309);
        list.setNumber(34787);
        list.setNumber(1);
        list.calculateStats();

        assertEquals(1, list.getMin());
    }

    @Test
    void calculate_deviation_handles_large_inputs(){
        NumberSet list = new NumberSet();
        list.setNumber(3);
        list.setNumber(12);
        list.setNumber(10200);
        list.setNumber(32);
        list.setNumber(17);
        list.setNumber(856);
        list.setNumber(4920);
        list.setNumber(33);
        list.setNumber(16);
        list.setNumber(8675309);
        list.setNumber(34787);
        list.setNumber(1);
        list.calculateStats();

        assertEquals(2396469.6, list.getDeviation());
    }
}