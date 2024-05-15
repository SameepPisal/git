import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	  @Test
	    public void testAdd() {
	        calculate calculator = new calculate();
	        assertEquals(5, calculator.add(2, 3));
	    }

	    @Test
	    public void testSubtract() {
	    	calculate calculator = new calculate();
	        assertEquals(2, calculator.subtract(5, 3));
	    }

}
