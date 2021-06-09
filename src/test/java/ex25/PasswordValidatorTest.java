/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void does_checkSpecial_return_true_when_true(){
        PasswordValidator validator = new PasswordValidator();

        assertTrue(validator.checkSpecial("stringwith!"));
    }
    @Test
    void does_checkSpecial_return_false_when_false(){
        PasswordValidator validator = new PasswordValidator();

        assertFalse(validator.checkSpecial("hereismypassword"));
    }

    @Test
    void does_checkalph_return_false_when_false(){
        PasswordValidator validator = new PasswordValidator();

        assertFalse(validator.checkAlph("12747!"));
    }

    @Test
    void does_checkalph_return_true_when_true(){
        PasswordValidator validator = new PasswordValidator();

        assertTrue(validator.checkAlph("this1ismadefromletters!!"));
    }

    @Test
    void does_checkDigit_return_true_when_true(){
        PasswordValidator validator = new PasswordValidator();

        assertTrue(validator.checkDigit("This1hasnumbers2!!"));
    }

    @Test
    void does_checkDigit_return_false_when_false(){
        PasswordValidator validator = new PasswordValidator();

        assertFalse(validator.checkDigit("Thisdoesn'tthough"));
    }

    @Test
    void validator_return_0_for_veryweak(){
        PasswordValidator validator = new PasswordValidator();

        assertEquals(0 ,validator.strength("1234567"));
    }

    @Test
    void validator_returns_1_for_weak(){
        PasswordValidator validator = new PasswordValidator();

        assertEquals(1, validator.strength("letters"));
    }

    @Test
    void validator_returns_2_for_strong(){
        PasswordValidator v = new PasswordValidator();

        assertEquals(2, v.strength("this1haslettersa1nd2numbers999"));
    }

    @Test
    void validator_returns_3_for_veryStrong(){
        PasswordValidator v = new PasswordValidator();

        assertEquals(3, v.strength("This1hasitall!!!!1127!"));
    }
}