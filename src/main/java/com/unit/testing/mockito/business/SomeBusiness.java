package com.unit.testing.mockito.business;

public class SomeBusiness {
    public int calculateSum(int[] data)
    {
        int sum = 0;
        for(int value:data)
        {
            sum += value;
        }
        return sum;
    }
}
