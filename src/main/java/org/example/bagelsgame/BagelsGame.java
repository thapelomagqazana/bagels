package org.example.bagelsgame;

import org.example.userinput.UserInput;
import org.example.validator.Validator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


/**
 * BagelsGame class provides methods for the main game logic and calculating the outcome of the user's guess.
 */
public class BagelsGame {

    // Calculate the outcome of the guess.
    public static String countOutcome(String userInput, String code){
        int correct_digit_and_correct_position = 0;
        int correct_digit = 0;
        List<String> outcome = new ArrayList<>();

        for (int i = 0; i < userInput.length();i++){
            if (userInput.charAt(i) == code.charAt(i)){
                outcome.add("Fermi");
                correct_digit_and_correct_position++;
            } else if (code.contains(Character.toString(userInput.charAt(i)))) {
               outcome.add("Pico");
               correct_digit++;
            }
        }
        if (correct_digit_and_correct_position == 0 && correct_digit == 0){
            outcome.add("Bagels");
        }
        Collections.shuffle(outcome);

        String outcomeString = String.join(" ", outcome);

        return outcomeString;
    }

    // Main game loop: Allow the player to make guesses until they run out of guesses or win.
    public static void mainGameLoop(String code, int MaxGuesses, int remainingGuesses, int numDigits){

        while (remainingGuesses > 0){
            // Calculate the number of chances (guesses made) based on the remaining guesses.
            int chances = MaxGuesses - (remainingGuesses - 1);

            // Get the user's guess from the input.
            String input = UserInput.getUserInput(chances);

            // Validate the user input to ensure it is a valid guess.
            if (!Validator.isUserInputValid(input, numDigits)){
                System.out.println("Invalid input");
                continue; // Restart the loop to get a new valid input.
            }

            // If the user's guess matches the secret code, the player wins and the game ends.
            if (input.equals(code)){
                System.out.println("Congratulations! You've won!");
                break; // Exit the loop as the player has won.
            }

            // Calculate the outcome of the guess and display the clues to the player.
            String feedBack = countOutcome(input,code);
            System.out.println(feedBack);
            // Decrement the remaining guesses for the player.
            remainingGuesses--;
        }
    }
}
