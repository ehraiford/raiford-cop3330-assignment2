/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution36Test {

    @Test
    void addInput_does_not_accept_non_numeric_values(){
        NumberSet list = new NumberSet();
        list.setNumber(100);
        list.setNumber(200);
        list.setNumber(1000);
        list.setNumber(300);
        solution36.addInput(list, "cherrypie" );

        NumberSet actual = new NumberSet();
        actual.setNumber(100);
        actual.setNumber(200);
        actual.setNumber(1000);
        actual.setNumber(300);

        assertTrue(actual.printList().compareTo(list.printList()) == 0);
    }

    @Test
    void addInput_adds_number_to_end_of_list(){
        NumberSet list = new NumberSet();
        list.setNumber(100);
        list.setNumber(200);
        list.setNumber(1000);
        list.setNumber(300);
        solution36.addInput(list, "3020" );

        NumberSet actual = new NumberSet();
        actual.setNumber(100);
        actual.setNumber(200);
        actual.setNumber(1000);
        actual.setNumber(300);
        actual.setNumber(3020);

        assertTrue(actual.printList().compareTo(list.printList()) == 0);
    }

}