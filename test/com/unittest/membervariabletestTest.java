package com.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class membervariabletestTest {
    Member_variables ob;

    @Before
    public void setUp() throws Exception {
        ob = new member();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void testmembername() {
        String expectedValue = "Harry Potter";
        String actualValue = ob.membername("Harry Potter");
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void testMemberAge(){
        int expectedValue = 30;
        //Act
        int actualValue = ob.memberAge(30);
        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testMemberSalary(){
        long expectedValue = 48000;
        //Act
        long actualValue = ob.memberSalary(30);
        //Assert
        assertEquals(expectedValue,actualValue);
    }
}