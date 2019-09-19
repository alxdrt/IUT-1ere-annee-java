import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class TestSacPostal {

	private SacPostal sacPostal;
	private SacPostal sacPostalSpe;
	private Lettre lettre;
	private Colis colis;
	
	@Before
	public void setUp() throws Exception {
		this.sacPostal = new SacPostal();
		this.sacPostalSpe = new SacPostal(600F);
		this.lettre = new Lettre("Toulouse", "Paris", 75010, 3, 0.02F, 0,
				false);
		this.colis = new Colis("Toulouse", "Paris", 75010, 10, 0.3F, 0, "un colis", 1.5F);
	}

	@After
	public void tearDown() throws Exception {
		this.sacPostal = null;
		this.sacPostalSpe = null;
		this.lettre = null;
		this.colis = null;
	}

	@Test
	public void testGetCapacite() {
		assertEquals(500F,this.sacPostal.getCapacite(),0);
		assertEquals(600F,this.sacPostalSpe.getCapacite(),0);
	}

	@Test
	public void testGetVolumeVide() {
		assertEquals(0.5F,this.sacPostal.getVolume(),0);
		assertEquals(0.5F,this.sacPostalSpe.getVolume(),0);
	}
	
	@Test
	public void testGetVolumeLettre() {
		this.sacPostal.ajouterObjet(lettre);
		this.sacPostalSpe.ajouterObjet(lettre);
		assertEquals(0.52F,this.sacPostal.getVolume(),0);
		assertEquals(0.52F,this.sacPostalSpe.getVolume(),0);
	}
	
	@Test
	public void testGetVolumeColis() {
		this.sacPostal.ajouterObjet(colis);
		this.sacPostalSpe.ajouterObjet(colis);
		assertEquals(0.8F,this.sacPostal.getVolume(),0);
		assertEquals(0.8F,this.sacPostalSpe.getVolume(),0);
	}
	
	@Test
	public void testGetVolumeLettreColis() {
		this.sacPostal.ajouterObjet(colis);
		this.sacPostalSpe.ajouterObjet(colis);
		this.sacPostal.ajouterObjet(lettre);
		this.sacPostalSpe.ajouterObjet(lettre);
		assertEquals(0.82F,this.sacPostal.getVolume(),0);
		assertEquals(0.82F,this.sacPostalSpe.getVolume(),0);
	}
	
	@Ignore
	@Test
	public void testRuntime(){
		
	}
	
	@Test
	public void testTarifRemboursemennt(){
		
	}
}
