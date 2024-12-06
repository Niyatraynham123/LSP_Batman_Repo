package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Implementation of RandomNumberGenerator using Java's built-in Random class.
 */
public class BuiltInRandomGenerator implements RandomNumberGenerator {
    @Override
    public int generate() {
        Random random = new Random();
        return random.nextInt(Integer.MAX_VALUE) + 1; // Ensures positive integer
    }
}
