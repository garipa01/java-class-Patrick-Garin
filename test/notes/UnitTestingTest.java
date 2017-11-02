
package notes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author garipa01
 */
public class UnitTestingTest {
    
    public UnitTestingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testIsEven() {
        System.out.println("isEven");
        int n = 0;
        boolean expResult = true;
        boolean result = UnitTesting.isEven(n);
        assertEquals(expResult, result);
        n = 5;
        expResult = false;
        result = UnitTesting.isEven(n);
        assertEquals(expResult, result);
    }
    
}
