public class ObjetPostal {

	private String origine;
	private String destination;
	private int codePostal;
	private int poidsEnGrammes;
	private float volumeEnDm3;
	private int tauxRecommandation;

	

	public ObjetPostal(String origine, String destination, int codePostal,
			int poidsEnGrammes, float volumeEnDm3, int tauxRecommandation) {
		this.origine = origine;
		this.destination = destination;
		this.codePostal = codePostal;
		this.poidsEnGrammes = poidsEnGrammes;
		this.volumeEnDm3 = volumeEnDm3;
		this.tauxRecommandation = tauxRecommandation;
	}



	public int getTauxRecommandation() {
		return this.tauxRecommandation;
	}

	public void setTauxRecommandation(int tauxRecommandation){
		this.tauxRecommandation = tauxRecommandation;
	}

	public float getVolumeEnDm3() {
		return volumeEnDm3;
	}
	
	public void setVolumeEnDm3(float volumeEnDm3) {
		this.volumeEnDm3 = volumeEnDm3;
	}
	
	public int getCodePostal() {
		return codePostal;
	}

	public String getDestination() {
		return destination;
	}
	
	@Override
	public String toString(){
		return "["+this.getCodePostal()+"/"+this.getDestination()+"/"+this.getTauxRecommandation();
	}
	

}