package com.seansellek;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChangeTest 
{
    @Test
    public void test() {
        assertEquals(Change.getChange(2), 2);
        assertEquals(Change.getChange(28), 6);
    }
}
