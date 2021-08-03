package com.seansellek;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MaxPairwiseProductTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void doesNotOverflowInt()
    {
        int[] numbers = { 1000000, 90000 };
        assertEquals(
            MaxPairwiseProduct.getMaxPairwiseProduct(numbers),
            Long.valueOf(90000000000L)
        );
    }
}
