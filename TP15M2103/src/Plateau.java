
public class Plateau {

	public static final int NBCASES = 48;
	private Case c;
	private Case [] tab;
	int CaseAttendue;
	
	public Plateau(int NBCASES){
		NBCASES = this.NBCASES;
		this.tab = new Case[48];
	}
	
	public void calculDeplacement(int a, int b){

		switch(c.getNumero())
		{ 
		case 12 : CaseAttendue = 2;
		case 18 : CaseAttendue = 5;
		case 24 : CaseAttendue = 2;
		case 27 : CaseAttendue = 5;
		case 33 : CaseAttendue = 4;
			
		}
	}
	
}
