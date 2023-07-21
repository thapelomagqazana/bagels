package org.example;

import org.example.validator.Validator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ValidatorTest {

    @Test
    public void testValidUserInput(){
        // Test valid user inputs
        assertTrue(Validator.isUserInputValid("123",3));
        assertTrue(Validator.isUserInputValid("456",3));
        assertTrue(Validator.isUserInputValid("789", 3));
    }

    @Test
    public void testInvalidUserInput(){
        // Test invalid user inputs
        assertFalse(Validator.isUserInputValid("",3));
        assertFalse(Validator.isUserInputValid(" ", 3));
        assertFalse(Validator.isUserInputValid("1234", 3));
        assertFalse(Validator.isUserInputValid("abc", 3));
        assertFalse(Validator.isUserInputValid("12x", 3));
        assertFalse(Validator.isUserInputValid(" 345 ", 3));
    }

}
