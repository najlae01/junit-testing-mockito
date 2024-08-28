package com.unit.testing.mockito.business;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomeBusinessTest {

    @Test
    public void calculateSum_Basic()
    {
        SomeBusiness business = new SomeBusiness();
        int actualResult = business.calculateSum(new int[] {1,2,3});
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_0neValue()
    {
        SomeBusiness business = new SomeBusiness();
        int actualResult = business.calculateSum(new int[] {4});
        int expectedResult = 4;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_Empty()
    {
        SomeBusiness business = new SomeBusiness();
        int actualResult = business.calculateSum(new int[] {});
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }
}
