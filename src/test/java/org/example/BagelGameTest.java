package org.example;

import org.example.bagelsgame.BagelsGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BagelGameTest {

    @Test
    public void testCountOutcome(){
        // Test the outcome of the guess for a correct guess
        int[] outcome1 = BagelsGame.countOutcome("123", "123");

        assertEquals(3, outcome1[0]);
        assertEquals(0,outcome1[1]);

        // Test the outcome of the guess for a partially correct guess
        int[] outcome2 = BagelsGame.countOutcome("143", "123");
        assertEquals(2, outcome2[0]);
        assertEquals(0,outcome2[1]);

        //Test the outcome of the guess for an incorrect guess
        int[] outcome3 = BagelsGame.countOutcome("789", "123");

        assertEquals(0, outcome3[0]);
        assertEquals(0, outcome3[1]);
    }

}
