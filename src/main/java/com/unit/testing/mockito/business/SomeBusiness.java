package com.unit.testing.mockito.business;

import com.unit.testing.mockito.data.SomeDataService;

public class SomeBusiness {

    SomeDataService someDataService;

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }

    public int calculateSum(int[] data)
    {
        int sum = 0;
        for(int value:data)
        {
            sum += value;
        }
        return sum;
    }

    public int calculateSumUsingSomeDataService()
    {
        int sum = 0;
        int[] data = someDataService.retriveAllData();
        for(int value:data)
        {
            sum += value;
        }
        return sum;
    }
}
