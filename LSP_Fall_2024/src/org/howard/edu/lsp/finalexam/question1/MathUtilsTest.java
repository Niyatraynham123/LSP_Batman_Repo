package org.howard.edu.lsp.finalexam.question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    MathUtils mathUtils = new MathUtils();

    // Test cases for factorial method
    @Test
    void testFactorialOfZero() {
        assertEquals(1, mathUtils.factorial(0));
    }

    @Test
    void testFactorialOfPositiveNumber() {
        assertEquals(120, mathUtils.factorial(5));
    }

    @Test
    void testFactorialOfNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-3));
        assertEquals("Number must be non-negative", exception.getMessage());
    }

    // Test cases for isPrime method
    @Test
    void testPrimeNumber() {
        assertTrue(mathUtils.isPrime(7));
    }

    @Test
    void testNonPrimeNumber() {
        assertFalse(mathUtils.isPrime(4));
    }

    @Test
    void testNegativeNumberNotPrime() {
        assertFalse(mathUtils.isPrime(-5));
    }

    // Test cases for gcd method
    @Test
    void testGcdWithZeroAndPositiveNumber() {
        assertEquals(12, mathUtils.gcd(0, 12));
    }

    @Test
    void testGcdWithTwoPositiveNumbers() {
        assertEquals(6, mathUtils.gcd(54, 24));
    }

    @Test
    void testGcdWithBothZeros() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0));
        assertEquals("Both numbers cannot be zero", exception.getMessage());
    }
}
