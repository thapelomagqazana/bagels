package org.example;

import org.example.numbergenerator.NumberGenerator;

import java.util.List;

/**
 * Bagels, by Thapelo Magqazana ,tapsmcgzee8@gmail.com
 * A deductive logic game where you must guess a number based on clues.
 * This version of this game was inspired by 'Invent Your Own Computer Games with Python'
 */
public class Main {
//    private final int NUM_DIGITS = 3;
    private final int MAX_GUESSES = 10;

    public static void main(String[] args) {
        List<Integer> secretCode = NumberGenerator.generateSecretCode();
        System.out.println(secretCode);
    }
}