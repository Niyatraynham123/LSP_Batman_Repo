package org.howard.edu.lsp.finalexam.question2;

/**
 * Implementation of RandomNumberGenerator using the Linear Congruential Generator algorithm.
 */
public class LinearCongruentialGenerator implements RandomNumberGenerator {
    private long seed = System.currentTimeMillis(); // Initial seed

    @Override
    public int generate() {
        // Parameters for the LCG (common constants used)
        long a = 1664525; // Multiplier
        long c = 1013904223; // Increment
        long m = (long) Math.pow(2, 31); // Modulus

        seed = (a * seed + c) % m;
        return (int) Math.abs(seed); // Ensures positive integer
    }
}
