import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestFibonacci {

	private Fibonacci f;
	
	@Before
	public void setUp() throws Exception {
		this.f = new FibonacciDynamique();
	}

	@After
	public void tearDown() throws Exception {
		this.f = null;
	}

	@Test
	public void  testFibonacciValeur0() {
		assertEquals(0.0F, this.f.Compute(0),0);
	}
	@Test
	public void  testFibonacciValeur1() {
		assertEquals(1.0F, this.f.Compute(1),0);
	}

	@Test
	public void  testFibonacciValeur2() {
		assertEquals(1.0F, this.f.Compute(2),0);
	}
	@Test
	public void  testFibonacciValeur3() {
		assertEquals(2.0F, this.f.Compute(3),0);
	}
	@Test
	public void  testFibonacciValeur4() {
		assertEquals(3.0F, this.f.Compute(4),0);
	}
	@Test
	public void  testFibonacciValeur5() {
		assertEquals(5.0F, this.f.Compute(5),0);
	}
	@Test
	public void  testFibonacciValeur6() {
		assertEquals(8.0F, this.f.Compute(6),0);
	}
	
	@Test
	public void  testFibonacciValeurs() {
		assertEquals(13.0F, this.f.Compute(7),0);
		assertEquals(21.0F, this.f.Compute(8),0);
		assertEquals(34.0F, this.f.Compute(9),0);
		assertEquals(75025.0F, this.f.Compute(25),0);
	}
	
}
