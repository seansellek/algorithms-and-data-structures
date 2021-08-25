package com.seansellek;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LCMTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void baseTest()
    {
        assertEquals(
            LCM.lcm_naive(10, 9),
            90
        );
    }
}
