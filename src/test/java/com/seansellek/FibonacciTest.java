package com.seansellek;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest 
{
    @Test
    public void stressTest() {
        for (int i = 0; i < 41; i++) {
            assertEquals(Fibonacci.naive_calc_fib(i), Fibonacci.calc_fib(i));
        }
    }
}
