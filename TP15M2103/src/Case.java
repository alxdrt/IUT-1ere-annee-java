
public abstract class Case {

	private int numéro;
	
	public Case(int numéro) {
		this.numéro = numéro;
	}
	
	public abstract int calculDeplacement(int a, int b);
	public int getNumero() {
		return this.numéro;
	}
}
