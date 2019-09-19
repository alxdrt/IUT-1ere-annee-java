
public class Jeu {

	private int positionPion;
	private Plateau p = new Plateau(48);

	public Jeu(int positionPion) {
		this.positionPion=positionPion;
	}

	public int lancerD�() {
		return (int) (6.0 * Math.random() + 1.0);	
	}


	public void jouerPion() {
		int d� = lancerD�();
		p.calculDeplacement(d�, positionPion);
	};

	public boolean estPartieFinie() {
		if (positionPion >= p.NBCASES) {
			return true;
		} else {
			return false;
		}

	}	



}
