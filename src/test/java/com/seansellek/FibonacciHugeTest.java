package com.seansellek;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciHugeTest 
{
    @Test
    public void stressTest() {
        for (long i = 0; i < 41; i++) {
            for (long m = 0; m < 9; m++) {
                assertEquals(FibonacciHuge.getFibonacciHuge(i, m), FibonacciHuge.getFibonacciHugeNaive(i, m));
            }
        }
    }

    @Test
    public void pisanoTest() {
        assertEquals(FibonacciHuge.pisano(2), 3);
        assertEquals(FibonacciHuge.pisano(3), 8);
        assertEquals(FibonacciHuge.pisano(4), 6);
        assertEquals(FibonacciHuge.pisano(5), 20);
        assertEquals(FibonacciHuge.pisano(17), 36);
        assertEquals(FibonacciHuge.pisano(62), 30);
        assertEquals(FibonacciHuge.pisano(75), 200);
        assertEquals(FibonacciHuge.pisano(125), 500);
    }
}
