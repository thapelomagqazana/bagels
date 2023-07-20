package org.example;

import org.example.numbergenerator.NumberGenerator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class NumberGeneratorTest {
    @Test
    void testTheCodeIsInRange(){
        List<Integer> secretCode = NumberGenerator.generateSecretCode();

        for (int num: secretCode){
            assertTrue(num >= 0 && num <=9);
        }

    }

    @Test
    void testTheLengthOfCode(){
        List<Integer> secretCode = NumberGenerator.generateSecretCode();

        assertEquals(3, secretCode.size());

    }
}
