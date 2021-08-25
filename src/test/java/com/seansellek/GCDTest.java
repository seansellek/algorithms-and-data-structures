package com.seansellek;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class GCDTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void baseTest()
    {
        assertEquals(
            GCD.gcd_euclid(10, 90),
            GCD.gcd_naive(10, 90)
        );


        assertEquals(
            GCD.gcd_euclid(100, 90),
            10
        );
    }
}
