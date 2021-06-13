/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex37;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class solution37Test {

    @Test
    void addSpecial_generates_random_special(){
        Random rand = new Random();
        ArrayList<Character> password = new ArrayList<>();
        solution37.addSpecial(password, rand);
        System.out.println(password);
        assertFalse(Character.isAlphabetic(password.get(0)) && Character.isDigit(password.get(0)));
    }

    @Test
    void addNumber_generates_random_number(){
        Random rand = new Random();
        ArrayList<Character> password = new ArrayList<>();
        solution37.addNumber(password, rand);
        System.out.println(password);
        assertTrue(Character.isDigit(password.get(0)));
    }

    @Test
    void addLetter_generates_random_letter(){
        Random rand = new Random();
        ArrayList<Character> password = new ArrayList<>();
        solution37.addLetter(password, rand);
        System.out.println(password);
        assertTrue(Character.isAlphabetic(password.get(0)));
    }

    @Test
    void formatString_removes_brackets_and_commas_from_password(){
        ArrayList<Character> password = new ArrayList<>();
        password.add('1');
        password.add('g');
        password.add('h');
        password.add('t');
        password.add('!');
        String formatted = solution37.formatString(password);
        assertTrue(formatted.compareTo("1ght!") == 0);
    }
}