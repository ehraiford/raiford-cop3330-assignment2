/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableOutputTest {

    @Test
    void digits_over_100_return_one_space(){
        TableOutput output = new TableOutput();
        assertEquals(" ", output.formatting(132));
    }
    @Test
    void digits_over_10_return_2_spaces(){
        TableOutput output = new TableOutput();
        assertEquals("  ", output.formatting(44));
    }
    @Test
    void digits_under_10_return_3_spaces(){
        TableOutput output = new TableOutput();
        assertEquals("   ", output.formatting(7));
    }

}