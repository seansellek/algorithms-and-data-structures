package com.seansellek;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FractionalKnapsackTest 
{
    @Test
    public void test() {
        int[] values =  {60, 100, 120};
        int[] weights = {20, 50, 30};
        assertEquals(180.0, FractionalKnapsack.getOptimalValue(50, values, weights), 0.00001);
    }
    @Test
    public void test2() {
        int[] values =  {500};
        int[] weights = {30};
        assertEquals(166.6667, FractionalKnapsack.getOptimalValue(10, values, weights), 0.0001);
    }
}
