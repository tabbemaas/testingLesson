package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void checkMultiplication() {
        double result = Calculator.multiply(2,3);
        assertEquals(6, result);
    }

    @Test
    public void checkDivision() {
        double result = Calculator.divide(8,10);
        assertEquals(0.8, result);
    }

    @Test
    public void checkSum() {
        double result = Calculator.sum(2330, 45.1);
        assertEquals(2375.1, result);
    }

    @Test
    public void checkSubtraction() {
        double result = Calculator.subtract(2,3);
        assertEquals(-1, result);
    }

}