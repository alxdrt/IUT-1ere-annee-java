import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CercleTest {
	
	private Point p1;
	private Point p2;
	private Cercle cer;

	@Before
	public void setUp() throws Exception {
		this.p1 = new Point(1,1);
		this.p2 = new Point(5,5);
		this.cer = new Cercle(p1,p2);
	}

	@After
	public void tearDown() throws Exception {
		this.cer = null;
		this.p1 = null;
		this.p2 = null;
	}

	@Test
	public void testRayon() {
		assertEquals(this.cer.Rayon(),0, Math.sqrt(32));
	}

	@Test
	public void testDiamètre() {
		assertEquals(this.cer.Diamètre(),0, 2*Math.sqrt(32));
	}

	@Test
	public void testPoint1() {
		assertEquals(this.cer.getP1(), this.p1 );
	}

	@Test
	public void testPoint2() {
		assertEquals(this.cer.getP2(), this.p2);
	}

	@Test
	public void testPérimètre() {
		assertEquals(this.cer.Périmètre(),0, Math.PI*2*Math.sqrt(32));
	}

	@Test
	public void testSurface() {
		assertEquals(this.cer.Périmètre(),0, Math.PI* Math.pow(Math.sqrt(32),2));
	}

}
