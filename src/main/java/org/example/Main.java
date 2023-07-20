package org.example;

import org.example.bagelsgame.BagelsGame;
import org.example.numbergenerator.NumberGenerator;
import org.example.userinput.UserInput;
import org.example.validator.Validator;

import java.util.List;

/**
 * Bagels, by Thapelo Magqazana ,tapsmcgzee8@gmail.com
 * A deductive logic game where you must guess a number based on clues.
 * This version of this game was inspired by 'Invent Your Own Computer Games with Python'
 */
public class Main {
    private static final int MAX_GUESSES = 10;
    private static int guessesLeft = 10;

    public static void main(String[] args) {
        // The number of guesses remaining for the player.
        List<Integer> secretCode = NumberGenerator.generateSecretCode();

        // Convert the secret code to a string for easier comparison with user input.
        String stringCode = NumberGenerator.listToString(secretCode);

        // Main game loop
        BagelsGame.mainGameLoop(stringCode, MAX_GUESSES, guessesLeft);
        System.out.println("The result is: "+stringCode);
    }
}