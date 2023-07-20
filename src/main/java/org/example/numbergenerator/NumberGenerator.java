package org.example.numbergenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * NumberGenerator class provides methods for generating a secret code and converting a list of integers to a string.
 */
public class NumberGenerator {
    private static final int NUM_DIGITS = 3;
    private static Random random = new Random();

    /**
     * Generate a secret code as a list of integers.
     * @return A list of integers representing the secret code.
     */
    public static List<Integer> generateSecretCode(){
        List<Integer> secretCode = new ArrayList<>();
        for (int i = 0; i < NUM_DIGITS; i++){
            int digit;
            digit = random.nextInt(10);
            while (secretCode.contains(digit)){
                digit = random.nextInt(10);
            }
            secretCode.add(digit);
        }

        return secretCode;
    }

    /**
     * Convert a list of integers representing the secret code to a string.
     * @param code The list of integers representing the secret code.
     * @return A string representation of the secret code.
     */
    public static String listToString(List<Integer> code){
        StringBuilder stringBuilder = new StringBuilder();

        for (int num : code){
            stringBuilder.append(num);
        }
        return stringBuilder.toString();
    }
}
