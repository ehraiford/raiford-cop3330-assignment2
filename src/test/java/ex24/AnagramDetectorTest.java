/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagram_returns_true_for_anagrams() {
      //given
        AnagramDetector detector = new AnagramDetector();

        //when

        boolean actual = detector.isAnagram("note", "note");

        //then
        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_false_for_nonanagrams(){
        //
        AnagramDetector detector = new AnagramDetector();

        //when
        boolean actual = detector.isAnagram("difo", "god");


        //then
        assertFalse(actual);
    }

    @Test
    void findLength_returns_correct_for_same_length(){
        //given
        AnagramDetector detector = new AnagramDetector();

        //when
        int length = detector.findLength("cheesecake", "delicious!");
        int actual = 10;

        //then
        assertEquals(length, actual);
    }

    @Test
    void findLength_returns_correct_for_same_length_smaller(){
        //given
        AnagramDetector detector = new AnagramDetector();

        //when
        int length = detector.findLength("bingo", "banjo");
        int actual = 5;

        //then
        assertEquals(length, actual);
    }
    @Test
    void findLength_returns_neg1_for_different_length(){
        //given
        AnagramDetector detector = new AnagramDetector();

        //when
        int length = detector.findLength("happiness", "sadness");
        int actual = -1;

        //then
        assertEquals(length, actual);
    }
}