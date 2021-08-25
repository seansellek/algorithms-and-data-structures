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
}
