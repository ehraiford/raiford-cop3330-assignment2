/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTest {
    @Test
   void first_name_validator_returns_correct_when_true(){
        inputValidation valid = new inputValidation();
        assertEquals("" , inputValidation.firstNameValidator("Juandissimo"));
    }
    @Test
    void first_name_validator_returns_correct_when_one_char(){
        inputValidation valid = new inputValidation();
        assertEquals("Q is not a valid first name. It is too short. \n" , inputValidation.firstNameValidator("Q"));
    }

    @Test
    void first_name_validator_returns_correct_when_empty(){
        inputValidation valid = new inputValidation();
        assertEquals("The first name must be filled in.\n", inputValidation.firstNameValidator(""));
    }
    @Test
    void last_name_validator_returns_correct_when_true(){
        inputValidation valid = new inputValidation();
        assertEquals("" , inputValidation.lastNameValidator("Magnifico"));
    }
    @Test
    void last_name_validator_returns_correct_when_one_char(){
        inputValidation valid = new inputValidation();
        assertEquals("M is not a valid last name. It is too short. \n" , inputValidation.lastNameValidator("M"));
    }

    @Test
    void last_name_validator_returns_correct_when_empty(){
        inputValidation valid = new inputValidation();
        assertEquals("The last name must be filled in.\n", inputValidation.lastNameValidator(""));
    }


    @Test
    void ID_validator_returns_correct_when_true(){
        inputValidation valid = new inputValidation();
        assertEquals("", inputValidation.IDValidator("CP-3330"));
    }

    @Test
    void ID_validator_returns_correct_when_too_short(){
        inputValidation valid = new inputValidation();
        assertEquals("c-213 is not a valid ID.\n", inputValidation.IDValidator("c-213"));
    }

    @Test
    void ID_validator_returns_correct_when_too_long(){
        inputValidation valid = new inputValidation();
        assertEquals("Coop-3330 is not a valid ID.\n", inputValidation.IDValidator("Coop-3330"));
    }

    @Test
    void ID_validator_returns_correct_when_missing_hyphen(){
        inputValidation valid = new inputValidation();
        assertEquals("cop3330 is not a valid ID.\n", inputValidation.IDValidator("cop3330"));
    }

    @Test
    void ID_validator_returns_correct_when_digits_missing(){
        inputValidation valid = new inputValidation();
        assertEquals("cp-fido is not a valid ID.\n", inputValidation.IDValidator("cp-fido"));
    }

    @Test
    void ID_validator_returns_correct_when_chars_missing(){
        inputValidation valid = new inputValidation();
        assertEquals("13-2840 is not a valid ID.\n", inputValidation.IDValidator("13-2840"));
    }

    @Test
    void zip_validator_returns_true_response_correctly(){
        inputValidation valid = new inputValidation();
        assertEquals("", inputValidation.zipValidator("34787"));
    }

    @Test
    void zip_validator_returns_false_response_correctly(){
        inputValidation valid = new inputValidation();
        assertEquals("The ZIP code must be numeric.", inputValidation.zipValidator("Winter11Garden"));
    }
}