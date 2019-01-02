package com.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class palindromeTest
{
    palindrome ob;
    @Before
    public void setUp() throws Exception {
        ob = new palindrome();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void main() {
        long expectedValue = 321;
        //Act
        long actualValue = ob.checkPalindrome(123);
        //Assert
        assertEquals(expectedValue,actualValue);
    }
    public void TestPalindromeSuccess() throws Exception{
        long expectedValue = 12321;
        //Act
        long actualValue = ob.checkPalindrome(12321);
        //Assert
        assertEquals(expectedValue,actualValue);

    }
    public void TestPalindromeFailure(){
        long expectedValue = 1232;
        //Act
        long actualValue = ob.checkPalindrome(1232);
        //Assert
        assertEquals(expectedValue,actualValue);

    }
}