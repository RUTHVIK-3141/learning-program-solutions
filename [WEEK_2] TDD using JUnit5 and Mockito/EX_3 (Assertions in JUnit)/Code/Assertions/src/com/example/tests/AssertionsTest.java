package com.example.tests;

import static org.junit.Assert.*;    // JUnit 4 assertions
import org.junit.Test;               // JUnit 4 @Test

public class AssertionsTest {

    @Test
    void testAssertions() {
        assertEquals(5, 2 + 3, "2 + 3 should equal 5");

        assertTrue(5 > 3, "5 is greater than 3");

        assertFalse(5 < 3, "5 is not less than 3");

        assertNull(getNullValue(), "This should be null");

        assertNotNull(new Object(), "This should not be null");
    }

    // helper for the null assertion
    private Object getNullValue() {
        return null;
    }
}
