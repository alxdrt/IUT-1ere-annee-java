package testPartiel2013;

public class Colis extends ObjetPostal {

	private String Contenu;
	private double ValeurDéclarée;
	
	public Colis(String Ori, String Dest, int Code, int tauxR, double Vol,
			double Poids,String Contenu, double ValeurDéclarée) {
		super(Ori, Dest, Code, tauxR, Vol, Poids);
		this.Contenu = Contenu;
		this.ValeurDéclarée = ValeurDéclarée;		
	}

	public static final double ConstanteAffranchissement = 2;
	public static final double Surtaxe = 3;
	
	@Override
	public double Affranchissement(int tauxR, double Volume) {
		if (Volume < 0.125) {
			if (tauxR == 0) {
				return ConstanteAffranchissement;
			} else if (tauxR == 1) {
				return ConstanteAffranchissement + 0.5;
			} else if (tauxR == 2) {
				return ConstanteAffranchissement + 1.5;
			}
		} else {
			if (tauxR == 0) {
				return ConstanteAffranchissement + Surtaxe;
			} else if (tauxR == 1) {
				return ConstanteAffranchissement + Surtaxe + 0.5;
			} else if (tauxR == 2) {
				return ConstanteAffranchissement + Surtaxe + 1.5;
			}
		}
		return 0;
	}

	@Override
	public double Remboursement(int tauxR) {
		if (tauxR == 0) {
			return 0;
		} else if (tauxR == 1) {
			return 0.1 * this.ValeurDéclarée;
		}
		return 0.5 * this.ValeurDéclarée;
	}

	@Override
	public String toString(int Code, String Dest, int tauxR, double Volume) {
		return "Colis ["+Code+"/"+Dest+"/"+tauxR+"/"+Volume+"/"+this.ValeurDéclarée+"]";
	}

}
