package test;

import demo.DemoAppl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoApplTest {
    int[] numbers = { 10, 20, 30, 40, 50 };
    int[] single = { 100 };
    int[] negative = { -10, -20, -30, -40, -50 };
    int[] empty = {};

    @Test
    void testSumArrayPositiveCase() {
        assertEquals(150, DemoAppl.sumArray(numbers));
        assertEquals(100, DemoAppl.sumArray(single));
        assertEquals(-150, DemoAppl.sumArray(negative));
        assertEquals(0, DemoAppl.sumArray(empty));
        assertEquals(0, DemoAppl.sumArray(null));
    }

    @Test
    void sumArrayNegativeCase(){
        assertNotEquals(100, DemoAppl.sumArray(numbers));
        assertNotEquals(1, DemoAppl.sumArray(single));
        assertNotEquals(150, DemoAppl.sumArray(negative));
        assertNotEquals(100, DemoAppl.sumArray(empty));
    }

    @Test
    void averagePositiveCase() {
        double avg1 = DemoAppl.average(numbers);
        double avg2 = DemoAppl.average(single);
        double avg3 = DemoAppl.average(negative);
        assertEquals(30., avg1, 0.001);
        assertEquals(100., avg2, 0.001);
        assertEquals(-30., avg3, 0.001);
        assertEquals(0, DemoAppl.average(empty), 0.001);
        assertEquals(0, DemoAppl.average(null));
    }

    @Test
    void averageBug() {
        assertNotEquals(150, DemoAppl.averageBug(numbers));
        assertNotEquals(100, DemoAppl.averageBug(single));
        assertNotEquals(-150, DemoAppl.averageBug(negative));
        assertNotEquals(0, DemoAppl.averageBug(empty));
        assertEquals(28.0, DemoAppl.averageBug(numbers), 0.001);
        assertEquals(0.0, DemoAppl.averageBug(single), 0.001);
    }

    @Test
    void maxValuePositiveCase() {
        assertEquals(50, DemoAppl.maxValue(numbers));
        assertEquals(100, DemoAppl.maxValue(single));
        assertEquals(-10, DemoAppl.maxValue(negative));
        assertEquals(0, DemoAppl.maxValue(empty));
        assertEquals(0, DemoAppl.maxValue(null));
    }

    @Test
    void maxValueNegativeCase(){
        assertNotEquals(100, DemoAppl.maxValue(numbers));
        assertNotEquals(1, DemoAppl.maxValue(single));
        assertNotEquals(0, DemoAppl.maxValue(negative));
        assertNotEquals(1, DemoAppl.maxValue(empty));
    }
}