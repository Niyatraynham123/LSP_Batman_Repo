package org.howard.edu.lsp.finalexam.question2;

/**
 * Singleton service class that provides random number generation
 * using the Strategy pattern.
 */
public class RandomNumberService {
    private static RandomNumberService instance;
    private RandomNumberGenerator strategy;

    /**
     * Private constructor to prevent instantiation.
     */
    private RandomNumberService() {}

    /**
     * Returns the singleton instance of RandomNumberService.
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the strategy for random number generation.
     * @param strategy The random number generation strategy to use.
     */
    public void setStrategy(RandomNumberGenerator strategy) {
        this.strategy = strategy;
    }

    /**
     * Generates a random number using the current strategy.
     * @return A random positive integer.
     */
    public int generateRandomNumber() {
        if (strategy == null) {
            throw new IllegalStateException("No strategy set for random number generation");
        }
        return strategy.generate();
    }
}

