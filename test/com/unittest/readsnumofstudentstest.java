package com.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class  readsnumofstudentstest {
    numofgrades ob;
    int[]a = new int[]{1,2,3,4,5};

    @Before
    public void setUp() throws Exception {
        ob = new numofgrades();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void average_sucess() {
        double expectedValue = 12.45;
        double actualValue = ob.average(a);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void max_success() {
        int expectedValue = 80;
        int actualValue = ob.max(a);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void min_success() {
        int expectedValue = 89;
        int actualValue = ob.min(a);
        assertEquals(expectedValue, actualValue);
    }


}
