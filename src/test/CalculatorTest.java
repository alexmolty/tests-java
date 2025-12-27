package test;

import demo.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static final double DELTA = 1e-9;

    @Test
    void sum() {
        assertEquals(3, Calculator.sum(1, 2), DELTA);
        assertEquals(0, Calculator.sum(0, 0), DELTA);
        assertEquals(-2, Calculator.sum(-1, -1), DELTA);
        assertEquals(2.1, Calculator.sum(1.1, 1.0), DELTA);
        assertEquals(2147483648., Calculator.sum(2147483647, 1), DELTA);
        assertEquals(Double.POSITIVE_INFINITY, Calculator.sum(Double.MAX_VALUE, Double.MAX_VALUE), DELTA);
        assertEquals(0.3, Calculator.sum(0.1, 0.2), DELTA);
    }

    @Test
    void sub() {
        assertEquals(42, Calculator.sub(100, 58), DELTA);
        assertEquals(-100, Calculator.sub(0, 100), DELTA);
        assertEquals(32, Calculator.sub(64, 32), DELTA);
        assertEquals(Double.NEGATIVE_INFINITY, Calculator.sub(-Double.MAX_VALUE, Double.MAX_VALUE), DELTA);
        assertEquals(0.1, Calculator.sub(0.2, 0.1), DELTA);
    }

    @Test
    void mul() {
        assertEquals(12, Calculator.mul(3, 4), DELTA);
        assertEquals(0, Calculator.mul(0, 0), DELTA);
        assertEquals(-12, Calculator.mul(-3, 4), DELTA);
        assertEquals(4.5, Calculator.mul(0.5, 9), DELTA);
        assertEquals(Double.POSITIVE_INFINITY, Calculator.mul(Double.MAX_VALUE, Double.MAX_VALUE), DELTA);
        assertEquals(0.02, Calculator.mul(0.1, 0.2), DELTA);
    }

    @Test
    void div() {
        assertEquals(2.5, Calculator.div(5, 2), DELTA);
        assertEquals(2, Calculator.div(4, 2), DELTA);
        assertEquals(0, Calculator.div(0, 1), DELTA);
        assertEquals(-2, Calculator.div(-4, 2), DELTA);
        assertEquals(Double.NaN, Calculator.div(4, 0), DELTA);
        assertEquals(2.5, Calculator.div(0.5, 0.2), DELTA);
    }
}