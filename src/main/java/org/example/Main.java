package org.example;

import org.example.numbergenerator.NumberGenerator;
import org.example.userinput.UserInput;

import java.util.List;

/**
 * Bagels, by Thapelo Magqazana ,tapsmcgzee8@gmail.com
 * A deductive logic game where you must guess a number based on clues.
 * This version of this game was inspired by 'Invent Your Own Computer Games with Python'
 */
public class Main {
    private static boolean isPlaying = true;
    private static final int MAX_GUESSES = 10;
    private static int guessesLeft = 10;

    public static void main(String[] args) {
        List<Integer> secretCode = NumberGenerator.generateSecretCode();

        while (guessesLeft > 0){
            int chances = MAX_GUESSES - (guessesLeft - 1);
            String input = UserInput.getUserInput(chances);

            guessesLeft--;
        }
        System.out.println(secretCode);
    }
}