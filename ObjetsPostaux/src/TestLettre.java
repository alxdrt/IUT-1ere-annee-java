import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestLettre {

	private Lettre lettre;

	@Before
	public void setUp() throws Exception {
		this.lettre = new Lettre("Toulouse", "Paris", 75010, 3, 0.002F, 0,
				false);
	}

	@After
	public void tearDown() throws Exception {
		this.lettre = null;
	}


	@Test
	public void testAffranchissementTauxRecommandation0NonUrgente() {
		assertEquals(0.5F,this.lettre.tarifAffranchissement(),0.F);
	}

	@Test
	public void testAffranchissementTauxRecommandation0Urgente() {
		this.lettre.setUrgence(true);
		assertEquals(0.8F,this.lettre.tarifAffranchissement(),0.F);
	}
	
	@Test
	public void testAffranchissementTauxRecommandation1NonUrgente() {
		this.lettre.setTauxRecommandation(1);
		assertEquals(1.0F,this.lettre.tarifAffranchissement(),0.F);
	}
	
	@Test
	public void testAffranchissementTauxRecommandation1Urgente() {
		this.lettre.setUrgence(true);
		this.lettre.setTauxRecommandation(1);
		assertEquals(1.3F,this.lettre.tarifAffranchissement(),0.F);
	}
	
	@Test
	public void testAffranchissementTauxRecommandation2NonUrgente() {
		this.lettre.setTauxRecommandation(2);
		assertEquals(2.0F,this.lettre.tarifAffranchissement(),0.F);
	}
	
	@Test
	public void testAffranchissementTauxRecommandation2Urgente() {
		this.lettre.setUrgence(true);
		this.lettre.setTauxRecommandation(2);
		assertEquals(2.3F,this.lettre.tarifAffranchissement(),0.F);
	}
	
	@Test
	public void testRemboursementTauxRecommandation0() {
		assertEquals(0.F,this.lettre.tarifRemboursement(),0.F);
	}
	
	@Test
	public void testRemboursementTauxRecommandation1() {
		this.lettre.setTauxRecommandation(1);
		assertEquals(1.5F,this.lettre.tarifRemboursement(),0.F);
	}
	
	@Test
	public void testRemboursementTauxRecommandation2() {
		this.lettre.setTauxRecommandation(2);
		assertEquals(15.F,this.lettre.tarifRemboursement(),0.F);
	}
	
	@Test
	public void testToStringNonUrgent() {
		assertEquals(this.lettre.toString(),"Lettre [75010/Paris/0/ordinaire]");
	}
	
	@Test
	public void testToStringUrgent() {
		this.lettre.setUrgence(true);
		assertEquals(this.lettre.toString(),"Lettre [75010/Paris/0/urgent]");
	}
}
