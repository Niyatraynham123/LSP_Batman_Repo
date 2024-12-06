package org.howard.edu.lsp.finalexam.question2;

/**
 * Client program to demonstrate RandomNumberService with different strategies.
 */
public class RandomNumberClient {
    public static void main(String[] args) {
        RandomNumberService randomService = RandomNumberService.getInstance();

        // Use BuiltInRandomGenerator strategy
        randomService.setStrategy(new BuiltInRandomGenerator());
        System.out.println("Random number using BuiltInRandomGenerator: " + randomService.generateRandomNumber());

        // Use LinearCongruentialGenerator strategy
        randomService.setStrategy(new LinearCongruentialGenerator());
        System.out.println("Random number using LinearCongruentialGenerator: " + randomService.generateRandomNumber());
    }
}
