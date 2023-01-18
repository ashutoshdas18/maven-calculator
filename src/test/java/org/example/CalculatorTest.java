package org.example;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    Calculator calculator;
    public void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    public void tearDown() throws Exception {
        calculator = null;
    }

    public void testAdd() {
        assertEquals(15,calculator.add(7,8));
    }

    public void testMultiply() {
        assertEquals(56,calculator.multiply(7,8));

    }

    public void testSubtract() {
        assertEquals(-1,calculator.subtract(7,8));

    }

    public void testDivide() {
        assertEquals(2,calculator.divide(16,8),0.0);

    }
}