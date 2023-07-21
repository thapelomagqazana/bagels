package org.example;

import org.example.numbergenerator.NumberGenerator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class NumberGeneratorTest {
    @Test
    void testTheCodeIsInRange(){
        List<Integer> secretCode = NumberGenerator.generateSecretCode(3);

        for (int num: secretCode){
            assertTrue(num >= 0 && num <=9);
        }

    }

    @Test
    void testTheLengthOfCodeAndUniqueness(){
        List<Integer> secretCode = NumberGenerator.generateSecretCode(3);

        assertEquals(3, secretCode.size());

        // Test that the generated secret code has unique digits
        for (int i = 0; i < secretCode.size();i++){
            for (int j = i+1; j < secretCode.size(); j++){
                assertNotEquals(secretCode.get(i), secretCode.get(j));
            }
        }

    }

    @Test
    public void testListToString(){
        // Test converting a list of integers to a string
        List<Integer> code = List.of(1,2,3);
        String codeString = NumberGenerator.listToString(code);

        assertEquals("123", codeString);
    }
}
