
public abstract class Case {

	private int num�ro;
	
	public Case(int num�ro) {
		this.num�ro = num�ro;
	}
	
	public abstract int calculDeplacement(int a, int b);
	public int getNumero() {
		return this.num�ro;
	}
}
