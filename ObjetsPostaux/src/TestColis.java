import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestColis {

	private Colis colis;
	
	@Before
	public void setUp() throws Exception {
		this.colis = new Colis("Toulouse", "Paris", 75010, 10, 0.5F, 0, "un colis", 1.5F);
	}

	@After
	public void tearDown() throws Exception {
		this.colis = null;
	}

	@Test
	public void testAffranchissementTauxRecommandation0NonSurtaxe() {
		assertEquals(2,this.colis.tarifAffranchissement(),0.F);
	}

	@Test
	public void testAffranchissementTauxRecommandation0Surtaxe() {
		this.colis.setVolumeEnDm3(1.6F);
		assertEquals(5,this.colis.tarifAffranchissement(),0.F);
	}
	
	@Test
	public void testAffranchissementTauxRecommandation1NonSurtaxe() {
		this.colis.setTauxRecommandation(1);
		assertEquals(2.5F,this.colis.tarifAffranchissement(),0.F);
	}
	
	@Test
	public void testAffranchissementTauxRecommandation1Surtaxe() {
		this.colis.setTauxRecommandation(1);
		this.colis.setVolumeEnDm3(1.6F);
		assertEquals(5.5F,this.colis.tarifAffranchissement(),0.F);
	}
	
	@Test
	public void testAffranchissementTauxRecommandation2NonSurtaxe() {
		this.colis.setTauxRecommandation(2);
		assertEquals(3.5F,this.colis.tarifAffranchissement(),0.F);
	}
	
	@Test
	public void testAffranchissementTauxRecommandation2Surtaxe() {
		this.colis.setTauxRecommandation(2);
		this.colis.setVolumeEnDm3(1.6F);
		assertEquals(6.5F,this.colis.tarifAffranchissement(),0.F);
	}
	
	@Test
	public void testRemboursementTauxRecommandation0() {
		assertEquals(0.F,this.colis.tarifRemboursement(),0.F);
	}
	
	@Test
	public void testRemboursementTauxRecommandation1() {
		this.colis.setTauxRecommandation(1);
		assertEquals(0.15F,this.colis.tarifRemboursement(),0.F);
	}
	
	@Test
	public void testRemboursementTauxRecommandation2() {
		this.colis.setTauxRecommandation(2);
		assertEquals(0.75F,this.colis.tarifRemboursement(),0.F);
	}
	
	@Test
	public void testToString() {
		assertEquals(this.colis.toString(),"Colis [75010/Paris/0/0.5/1.5]");
	}
}
