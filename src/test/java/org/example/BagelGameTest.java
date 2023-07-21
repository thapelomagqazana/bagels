package org.example;

import org.example.bagelsgame.BagelsGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BagelGameTest {

    @Test
    public void testCountOutcome(){
        // Test the outcome of the guess for a correct guess
        String outcome = BagelsGame.countOutcome("123", "123");

        assertEquals("Fermi Fermi Fermi", outcome);

        // Test the outcome of the guess for a partially correct guess
        String outcome2 = BagelsGame.countOutcome("143", "123");
        assertEquals("Fermi Fermi", outcome2);

        //Test the outcome of the guess for an incorrect guess
        String outcome3 = BagelsGame.countOutcome("789", "123");
        assertEquals("Bagels", outcome3);


    }

}
