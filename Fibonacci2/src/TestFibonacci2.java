import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestFibonacci2 {

	private Fibonacci2 f;
	
	@Before
	public void setUp() throws Exception {
		this.f = new Fibonacci2(5,12,"ddddd");
	}

	@After
	public void tearDown() throws Exception {
		this.f = null;
	}

	@Test
	public void test() {
	assertEquals(5, this.f.premierEntier());
	}

	
	
	
	
	}




