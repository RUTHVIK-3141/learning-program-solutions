package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAddition() {
        int a = 2, b = 3;
        int result = a + b;
        assertEquals(5, result);
    }
}
