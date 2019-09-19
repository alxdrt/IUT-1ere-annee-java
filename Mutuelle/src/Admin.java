
public class Admin extends simpleuser {

	private simpleuser[] membres;
	
	public Admin(String ID, String mdp, String statut) {
		super(ID, mdp, statut);
		
	}

	@Override
	public String rappel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ajoutMembre(simpleuser membre) {
		this.membres = new simpleuser[membre];
		return "Membre "+membre.getID()+ "ajouté";
	}

	@Override
	public String supprimerMembre(simpleuser membre) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
