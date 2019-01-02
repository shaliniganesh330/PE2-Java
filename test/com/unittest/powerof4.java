package com.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class powerof4 {
            powerof4 ob;
        @Before
        public void setUp() throws Exception {
            ob = new powerof4();
        }

        @After
        public void tearDown() throws Exception {
            ob = null;
        }

        @Test
        public void powerof4sucess() {
            boolean expectedValue = true;
            //Act
            boolean actualValue = ob.powerof4_1(64);
            //Assert
            assertEquals(expectedValue,actualValue);
        }
        public void powerof4failure() throws Exception{
            boolean expectedValue = false;
            //Act
            boolean actualValue = ob.powerof4_1(13);
            //Assert
            assertEquals(expectedValue,actualValue);

        }

    }
