package org.example.validator;

/**
 * Validator class provides a method for validating user input in the Bagels game.
 */
public class Validator {
    /**
     * Check if the user input is valid.
     * @param userInput The user's input as a string.
     * @return true if the user input is valid, false otherwise.
     *
     */
    public static boolean isUserInputValid(String userInput){
        return !userInput.isBlank() && !userInput.isEmpty() &&
                userInput.length() == 3 && userInput.matches("\\d+");
    }
}
