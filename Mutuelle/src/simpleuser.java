
public abstract class simpleuser {

	private String ID;
	private String mdp;
	private String statut;

	public simpleuser(String ID, String mdp, String statut) {
		super();
		this.ID = ID;
		this.statut = statut;
	}
	
	public String getID(){
		return this.ID;
	}
	
	public void setStatut(String Statut) {
		this.statut = Statut;
	}
	public abstract String rappel();
	public abstract String ajoutMembre(simpleuser membre);
	public abstract String supprimerMembre(simpleuser membre);
	
	
}
