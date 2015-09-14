package com.tddexample.fibonacci;

/**
 * Created by hxlin on 9/14/15.
 */
public class FibonacciGenerator {
    public int getNumberAtPosition(int position) {
        if(position < 2)
            return position;
        return  getNumberAtPosition(position - 1 ) + getNumberAtPosition(position - 2) ;
    }
}
