import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MonomeTest {
	
	private Monome n;
	private Monome q;
	private Monome n1;
	private Monome q1;
	
	@Before
	public void setUp() throws Exception {
	this.n = new Monome(1,2);
	this.q = new Monome(4,1);
	this.n1 = new Monome(4,0);
	this.q1 = new Monome(0,1);
	}

	@After
	public void tearDown() throws Exception {
		this.n = null;
		this.q = null; 
		this.n1 = null;
		this.q1 = null;
	}
	
	
	@Test
	public void testGetCoefficient() {
		assertEquals(1,0,this.n.getCoefficient());
		};


	@Test
	public void testGetExposant() {

		assertEquals(1,this.q.getExposant());
	}

	@Test(expected = ArithmeticException.class)
	public void testSomme() {
		assertEquals(this.n.getCoefficient() + this.q.getCoefficient(),0,this.n.somme(q).getCoefficient());
	}

	@Test(expected = ArithmeticException.class)
	public void testProduit() {
		assertEquals(this.n.getCoefficient() * this.q.getCoefficient(),0,this.n.produit(q).getCoefficient());
		assertEquals(this.n.getExposant() + this.q.getExposant(),0,n.produit(q).getExposant());
	}

	@Test
	public void testDérivée() {
		assertEquals(this.n.getCoefficient() * this.n.getExposant(),0, this.n.dérivée().getCoefficient());
		assertEquals(this.n.getExposant() - 1,0,this.n.dérivée().getExposant());
		}



	
	@Test(expected = ArithmeticException.class)
	public void testEstNul() {
	assertTrue(this.q1.estNul());
	assertFalse(this.n1.estNul());
	}

	}






