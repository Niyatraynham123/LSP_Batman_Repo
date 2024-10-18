package org.howard.edu.lsp.midterm.question2;

public class Calculator {
    
    /**
     * Sum of two numbers that are ints
     *  @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Sum two numbers that are doubles
     *  @param a the first double
     * @param b the second double
     * @return the sum of a and b
     */
    public static double sum(double a, double b) {
        return a + b;
    }

    /**
     * Sum of all the elements in an array of ints.
     *  @param numbers the array of integers to be summed
     * @return the sum of all elements in the array
     * @throws NullPointerException if the array is null
     */
    public static int sum(int[] numbers) {
        if (numbers == null) {
            throw new NullPointerException("The array cannot be null.");
        }
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}

