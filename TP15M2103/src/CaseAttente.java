
public class CaseAttente extends Case {

	public CaseAttente(int num�ro) {
		super(num�ro);
	
	}


	public int calculDeplacement(int a, int b) {
		if (a == CaseAttendue) {
			return a+b;
		} else {
			return a;
		}
	}



}
