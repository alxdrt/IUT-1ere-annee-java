import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DureeEnHeuresMinutesSecondesTest {

	private Duree h1;

	@Before
	public void setUp() throws Exception {
		this.h1 = new DureeEnHeuresMinutesSecondes(1,2,3);
	}

	@After
	public void tearDown() throws Exception {
		this.h1 = null;
	}


	@Test
	public void testGetters() {

		assertEquals(1,h1.getHeures());
		assertEquals(2,h1.getMinutes());
		assertEquals(3,h1.getSecondes());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testHeuresNegative() {
		this.h1 = new DureeEnHeuresMinutesSecondes(-1,2,3);		
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMinutesNegative() {
		this.h1 = new DureeEnHeuresMinutesSecondes(1,-2,3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testMinutesSuperieur59() {
		this.h1 = new DureeEnHeuresMinutesSecondes(1,65,3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSecondesNegative() {
		this.h1 = new DureeEnHeuresMinutesSecondes(1,5,-9);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSecondesSuperieur59() {
		this.h1 = new DureeEnHeuresMinutesSecondes(1,5,65);
	}
	
	@Test
	public void testEqualsValeursEgales() {
		Duree h2 = new DureeEnHeuresMinutesSecondes(1,2,3);
		assertEquals(h1,h2);
	}
	
	@Test
	public void testEqualsValeursNonEgales() {
		Duree h2 = new DureeEnHeuresMinutesSecondes(0,2,3);
		assertNotEquals(h2,h1);
		Duree h3 = new DureeEnHeuresMinutesSecondes(1,0,3);
		assertNotEquals(h3,h1);
		Duree h4 = new DureeEnHeuresMinutesSecondes(1,2,0);
		assertNotEquals(h4,h1);
	}
	
	@Test
	public void testAjouterUneSeconde() {
		h1.ajouterUneSeconde();
		assertEquals(4,h1.getSecondes());
		Duree h2 = new DureeEnHeuresMinutesSecondes(0,2,59);
		h2.ajouterUneSeconde();
		assertEquals(3,h2.getMinutes());
		Duree h3 = new DureeEnHeuresMinutesSecondes(1,59,59);
		h3.ajouterUneSeconde();
		assertEquals(2,h3.getHeures());	
	}
	
	
	@Test
	public void testCompareTo() {
		assertEquals(0, ((DureeEnHeuresMinutesSecondes) h1).compareTo(new DureeEnHeuresMinutesSecondes(1,2,3)));
		assertTrue(((DureeEnHeuresMinutesSecondes) h1).compareTo(new DureeEnHeuresMinutesSecondes(1,2,1)) > 0);
		assertTrue(((DureeEnHeuresMinutesSecondes) h1).compareTo(new DureeEnHeuresMinutesSecondes(1,3,2)) < 0);
		
	}
	
	@Test
	public void testToString() {
		assertEquals("1:2:3",h1.toString());
	}
}

