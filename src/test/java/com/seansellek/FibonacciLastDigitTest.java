package com.seansellek;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciLastDigitTest 
{
    @Test
    public void stressTest() {
        assertEquals(2, FibonacciLastDigit.getFibonacciLastDigit((3)));
        assertEquals(9, FibonacciLastDigit.getFibonacciLastDigit((331)));
        assertEquals(5, FibonacciLastDigit.getFibonacciLastDigit((327305)));
    }
}
