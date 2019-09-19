
public class CaseAttente extends Case {

	public CaseAttente(int numéro) {
		super(numéro);
	
	}


	public int calculDeplacement(int a, int b) {
		if (a == CaseAttendue) {
			return a+b;
		} else {
			return a;
		}
	}



}
