package com.tddexample.fibonacci;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hxlin on 9/14/15.
 */
public class FibonacciGeneratorTests {
    @Test
    public void firstFibonacciNumberIsZero() throws Exception{
        assertEquals(0, getFibonacciNumberAtPositionInSequence(0));
    }

    @Test
    public void secondFibonacciNumberIsOne() throws Exception{
        assertEquals(1, getFibonacciNumberAtPositionInSequence(1));
    }

    @Test
    public void thirdFibonacciNumberIsOne() throws Exception{
        assertEquals(1, getFibonacciNumberAtPositionInSequence(2));
    }

    @Test
    public void fourthFibonacciNumberIsTwo() throws Exception{
        assertEquals(2, getFibonacciNumberAtPositionInSequence(3));
    }

    @Test
    public void sixthFibonacciNumberIsFive() throws Exception{
        assertEquals(5, getFibonacciNumberAtPositionInSequence(5));
    }

    private int getFibonacciNumberAtPositionInSequence(int position) {
        return new FibonacciGenerator().getNumberAtPosition(position);
    }
}
