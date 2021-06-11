/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class rateManagerTest {
    @Test
    void rate_validator_returns_false_on_non_numeric(){
        rateManager test = new rateManager();
        assertFalse(test.validateRate("fido the dog."));
    }
    @Test
    void rate_validator_returns_true_for_numeric(){
        rateManager test = new rateManager();
        assertTrue(test.validateRate("8675309"));
    }
    @Test
    void rate_validator_returns_true_for_numeric2(){
        rateManager test = new rateManager();
        assertTrue(test.validateRate("7.2"));
    }
    @Test
    void rate_validator_returns_false_on_mixed_characters() {
        rateManager test = new rateManager();
        assertFalse(test.validateRate("11fahrenheit451"));
    }
}