package test;

import demo.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        assertEquals(3, Calculator.sum(1, 2));
        assertEquals(0, Calculator.sum(0, 0));
        assertEquals(-2, Calculator.sum(-1, -1));
        assertEquals(2.1, Calculator.sum(1.1, 1.0));
        assertEquals(2147483648., Calculator.sum(2147483647, 1));
        assertEquals(Double.POSITIVE_INFINITY, Calculator.sum(Double.MAX_VALUE, Double.MAX_VALUE));
    }

    @Test
    void sub() {
        assertEquals(42, Calculator.sub(100, 58));
        assertEquals(-100, Calculator.sub(0, 100));
        assertEquals(32, Calculator.sub(64, 32));
        assertEquals(Double.NEGATIVE_INFINITY, Calculator.sub(-Double.MAX_VALUE, Double.MAX_VALUE));
    }

    @Test
    void mul() {
        assertEquals(12, Calculator.mul(3, 4));
        assertEquals(0, Calculator.mul(0, 0));
        assertEquals(-12, Calculator.mul(-3, 4));
        assertEquals(4.5, Calculator.mul(0.5, 9));
        assertEquals(Double.POSITIVE_INFINITY, Calculator.mul(Double.MAX_VALUE, Double.MAX_VALUE));

    }

    @Test
    void div() {
        assertEquals(2.5, Calculator.div(5, 2));
        assertEquals(2, Calculator.div(4, 2));
        assertEquals(0, Calculator.div(0, 1));
        assertEquals(-2, Calculator.div(-4, 2));
        assertEquals(Double.NaN, Calculator.div(4, 0));
    }
}