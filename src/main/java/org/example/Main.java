package org.example;

import org.example.bagelsgame.BagelsGame;
import org.example.numbergenerator.NumberGenerator;


import java.util.List;

/**
 * Bagels, by Thapelo Magqazana ,tapsmcgzee8@gmail.com
 * A deductive logic game where you must guess a number based on clues.
 * This version of this game was inspired by 'Invent Your Own Computer Games with Python'
 */
public class Main {
    private static final int MAX_GUESSES = 10;
    private static final int NUM_DIGITS = 3;
    private static int guessesLeft = 10;

    public static String welcomeMessage(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\nBagels, by Thapelo Magqazana ,tapsmcgzee8@gmail.com\n"+
                "A deductive logic game where you must guess a number based on clues.\n\n"+
                "I am thinking of a "+NUM_DIGITS+"-digit number.\n"+
                "Try to guess what it is. Here are some clues:\n"+
                "When I say:        That means:\n"+
                "   Pico            One digit is correct but in the wrong position.\n"+
                "   Fermi           One digit is correct and in the right position.\n"+
                "   Bagels          No digit is correct.\n"+
                "For example, if the secret number was 248 and your guess was 843, the\n"+
                "clues would be Fermi Pico.\n");
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        String message = welcomeMessage();
        System.out.println(message);
        // The number of guesses remaining for the player.
        List<Integer> secretCode = NumberGenerator.generateSecretCode(NUM_DIGITS);

        // Convert the secret code to a string for easier comparison with user input.
        String stringCode = NumberGenerator.listToString(secretCode);

        // Main game loop
        BagelsGame.mainGameLoop(stringCode, MAX_GUESSES, guessesLeft, NUM_DIGITS);
        System.out.println("The result is: "+stringCode);
    }
}