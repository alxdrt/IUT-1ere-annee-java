

public class Banque {

	private String chaine;
	
	public Banque(String chaine) {
		this.chaine = chaine;
	}
	
	public String getLibellé() {
		return this.chaine;
	}
	public Banque Ouvrir(String s, double r) {
		Banque ceCompte = new Banque(s);
		
		
		return ceCompte;
	}
}
