package com.example.aaa_junit_demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testAdd_TwoPositiveNumbers_ReturnsSum() {

        int result = calculator.add(3, 7);

        assertEquals("3 + 7 should equal 10", 10, result);
    }

    @Test
    public void testMultiply_ByZero_ReturnsZero() {
        int result = calculator.multiply(5, 0);

        assertEquals("Anything times zero should be zero", 0, result);
    }
}
