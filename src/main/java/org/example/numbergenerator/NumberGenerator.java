package org.example.numbergenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {
    private static final int NUM_DIGITS = 3;
    private static Random random = new Random();

    public static List generateSecretCode(){
        List<Integer> secretCode = new ArrayList<>();
        for (int i = 0; i < NUM_DIGITS; i++){
            int digit;
            digit = random.nextInt(10);
            while (secretCode.contains(digit)){
                digit = random.nextInt(10);
            }
            secretCode.add(digit);
//            do{
//                digit = random.nextInt(10);
//                secretCode.add(digit);
//            }while (!secretCode.contains(digit));
        }
        return secretCode;
    }
}
