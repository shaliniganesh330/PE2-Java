import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactTest {
    Factorial ob;
    @Before
    public void setUp() throws Exception {
        ob = new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test    public void factorial_sucess_1() {
        long expectedValue = 120;
        long actualValue = ob.factorial(5);
        assertEquals(expectedValue, actualValue);
    }
    public void factorial_sucess_2() {
        long expectedValue = 479001600;
        long actualValue = ob.factorial(12);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void factorial_sucess_3() {
        long expectedValue = 1234324367888;
        long actualValue = ob.factorial(210);
        assertEquals(expectedValue, actualValue);
    }

}
