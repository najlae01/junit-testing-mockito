package com.unit.testing.mockito.business;

import com.unit.testing.mockito.data.SomeDataService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class SomeBusinessMockTest {

    SomeBusiness business = new SomeBusiness();
    SomeDataService dataServiceMock = mock(SomeDataService.class);

    @Before
    public void before()
    {
        business.setSomeDataService(dataServiceMock);
    }

    @Test
    public void calculateSum_Basic()
    {
        when(dataServiceMock.retriveAllData()).thenReturn(new int[] {1, 2, 3});

        int actualResult = business.calculateSumUsingSomeDataService();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_0neValue()
    {
        when(dataServiceMock.retriveAllData()).thenReturn(new int[] {4});

        int actualResult = business.calculateSumUsingSomeDataService();
        int expectedResult = 4;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_Empty()
    {
        when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});
        
        int actualResult = business.calculateSumUsingSomeDataService();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }
}
