package org.example.validator;

public class Validator {
    public static boolean isUserInputValid(String userInput){
        return userInput.length() == 3 && userInput.matches("\\d+");
    }
}
