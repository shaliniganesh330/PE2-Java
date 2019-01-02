package com.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class iseventestTest {
    iseventest ob;

    @Before
    public void setUp() throws Exception {
      ob = new iseventest();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void isevensuccess() {
        boolean expectedValue = true;
        //Act
        boolean actualValue = ob.evennun(22);
        //Assert
        assertEquals(expectedValue,actualValue);
    }


    @Test
    public void isevenfailure() {
        boolean expectedValue = false;
        //Act
        boolean actualValue = ob.evennun(23);
        //Assert
        assertEquals(expectedValue,actualValue);
    }


}