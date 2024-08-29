/*
* This is not an efficient solution. As you can see, it can't handle test cases for different data
* dynamically. It either requires (1) a lot of stubs (classes implementing the data service interface
* SomeDataService), a stub for each data case,
* or a conditional logic (2) returning different data for all the cases, which is obviously confusing
* to do since the data is usually huge.
* So whether we choose (1) or (2) it won't be a dynamic and convincing approach.
* And that's Mock Testing comes. Please refer to the SomeBusinessMockTest class to read the solution.
* */

package com.unit.testing.mockito.business;

import com.unit.testing.mockito.data.SomeDataService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class SomeDataServiceStub implements SomeDataService{

    @Override
    public int[] retriveAllData() {
        return new int[] {1, 2, 3};
    }
}

public class SomeBusinessStubTest {

    @Test
    public void calculateSum_Basic()
    {
        SomeBusiness business = new SomeBusiness();
        business.setSomeDataService(new SomeDataServiceStub());
        int actualResult = business.calculateSumUsingSomeDataService();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_0neValue()
    {
        SomeBusiness business = new SomeBusiness();
        business.setSomeDataService(new SomeDataServiceStub());
        int actualResult = business.calculateSumUsingSomeDataService();
        int expectedResult = 4;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_Empty()
    {
        SomeBusiness business = new SomeBusiness();
        business.setSomeDataService(new SomeDataServiceStub());
        int actualResult = business.calculateSumUsingSomeDataService();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }
}
