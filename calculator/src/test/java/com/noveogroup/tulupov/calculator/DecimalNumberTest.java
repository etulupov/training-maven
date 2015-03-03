package com.noveogroup.tulupov.calculator;

import org.junit.Test;

import static junit.framework.TestCase.*;

/**
 * Number test.
 */
public class DecimalNumberTest {
    @Test
    public void addTest() {
        final DecimalNumber a = new DecimalNumber(1);
        final DecimalNumber b = new DecimalNumber(2);
        final DecimalNumber result = new DecimalNumber(3);

        assertEquals(a.add(b), result);
    }

    @Test
    public void subTest() {
        final DecimalNumber a = new DecimalNumber(1);
        final DecimalNumber b = new DecimalNumber(2);
        final DecimalNumber result = new DecimalNumber(-1);

        assertEquals(a.sub(b), result);
    }

    @Test
    public void mulTest() {
        final DecimalNumber a = new DecimalNumber(1);
        final DecimalNumber b = new DecimalNumber(2);
        final DecimalNumber result = new DecimalNumber(2);

        assertEquals(a.mul(b), result);
    }

    @Test
    public void divTest() {
        final DecimalNumber a = new DecimalNumber(1);
        final DecimalNumber b = new DecimalNumber(2);
        final DecimalNumber result = new DecimalNumber(0.5);

        assertEquals(a.div(b), result);
    }
}
