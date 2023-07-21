package org.example;

import org.example.validator.Validator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ValidatorTest {

    @Test
    public void testValidUserInput(){
        // Test valid user inputs
        assertTrue(Validator.isUserInputValid("123"));
        assertTrue(Validator.isUserInputValid("456"));
        assertTrue(Validator.isUserInputValid("789"));
    }

    @Test
    public void testInvalidUserInput(){
        // Test invalid user inputs
        assertFalse(Validator.isUserInputValid(""));
        assertFalse(Validator.isUserInputValid(" "));
        assertFalse(Validator.isUserInputValid("1234"));
        assertFalse(Validator.isUserInputValid("abc"));
        assertFalse(Validator.isUserInputValid("12x"));
        assertFalse(Validator.isUserInputValid(" 345 "));
    }

}
