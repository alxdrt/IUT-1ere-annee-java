import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class RectangleTest {

	private Point p1;
	private Point p2;
	private Rectangle rec;
	
	
	@Before
	public void setUp() throws Exception {
		this.p1 = new Point(1,1);
		this.p2 = new Point(5,5);
		this.rec = new Rectangle(p1,p2);
	}

	@After
	public void tearDown() throws Exception {
		this.rec = null;
		this.p1 = null;
		this.p2 = null;
	}

	@Test
	public void testLongueur() {
		
		assertEquals(this.rec.Longueur(),0, 4.0);
	}

	@Test
	public void testLargeur() {
		assertEquals(this.rec.Largeur(), 0, 4.0);
	}

	@Test
	public void testPoint1() {
		assertEquals(this.rec.getP1(), this.p1 );
	}

	@Test
	public void testPoint2() {
		assertEquals(this.rec.getP2(), this.p2 );
	}

	@Test
	public void testPérimètre() {
		assertEquals(this.rec.Périmètre(), 0, 16);
	}

	@Test
	public void testSurface() {
		assertEquals(this.rec.Surface(), 0,  16);
	}

}
