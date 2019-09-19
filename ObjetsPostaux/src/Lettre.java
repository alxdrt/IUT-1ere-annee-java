public class Lettre extends ObjetPostal {

	private boolean urgence;

	public Lettre(String origine, String destination, int codePostal,
			int poidsEnGrammes, float volumeEnDm3, int tauxRecommandation,
			boolean urgence) {

		super(origine, destination, codePostal, poidsEnGrammes, volumeEnDm3,
				tauxRecommandation);
		this.urgence = urgence;
	}

	public float tarifAffranchissement() {
		final float TARIF_DE_BASE = 0.5F;
		final float TARIF_URGENCE = 0.3F;
		float tarif = TARIF_DE_BASE;
		if (this.getTauxRecommandation() == 1) {
			tarif += 0.5F;
		}
		if (this.getTauxRecommandation() == 2) {
			tarif += 1.5F;
		}
		if (this.urgence) {
			tarif += TARIF_URGENCE;
		}
		return tarif;
	}

	public void setUrgence(boolean urgence) {
		this.urgence = urgence;
	}

	public float tarifRemboursement() {
		if (this.getTauxRecommandation() == 0) {
			return 0.F;
		}
		if (this.getTauxRecommandation() == 1) {
			return 1.5F;
		}
		return 15.0F;
	}

	private String caractereUrgence() {
		if (this.urgence) {
			return "urgent";
		} else {
			return "ordinaire";
		}
	}

	@Override
	public String toString() {
		return "Lettre "+super.toString()+ "/" + this.caractereUrgence() + "]";
	}
}
