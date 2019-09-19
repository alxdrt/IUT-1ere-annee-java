public class Colis extends ObjetPostal  {

	private String contenu;
	private float prix;

	public Colis(String origine, String destination, int codePostal,
			int poidsEnGrammes, float volumeEnDm3, int tauxRecommandation,
			String contenu, float prix) {
		
		super(origine, destination, codePostal, poidsEnGrammes, volumeEnDm3,
				tauxRecommandation);
		this.contenu = contenu;
		this.prix = prix;
	}

	public float tarifAffranchissement() {
		final float TARIF_DE_BASE = 2.F;
		final float TARIF_SURTAXE = 3.F;
		float tarif = TARIF_DE_BASE;
		if (this.getTauxRecommandation() == 1){
			tarif += 0.5F;
		}
		if (this.getTauxRecommandation() == 2){
			tarif += 1.5F;
		}
		if (this.getVolumeEnDm3() > 1.25F){
			tarif += TARIF_SURTAXE;
		}
		return tarif;
	}


	public float tarifRemboursement() {
		if (this.getTauxRecommandation() == 1){
			return (0.1F*this.prix);
		}
		if (this.getTauxRecommandation() == 2){
			return (0.5F*this.prix);
		}
		return 0;
	}
	

	@Override
	public String toString(){
		return "Colis "+super.toString()+"/"+this.getVolumeEnDm3()+"/"+this.prix+"]";
	}
	
}
