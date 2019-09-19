package testPartiel2013;

public class Lettre extends ObjetPostal {

	private int CaractereUrgence;

	public Lettre(String Ori, String Dest, int Code, int tauxR, double Vol,
			double Poids, int CaracU) {
		super(Ori, Dest, Code, tauxR, Vol, Poids);
		this.CaractereUrgence = CaracU;

	}

	public static final double ConstanteAffranchissement = 0.5;
	public static final double ConstanteUrgence = 0.3;

	@Override
	public double Affranchissement(int tauxR, double Volume) {
		if (this.CaractereUrgence < 0 || this.CaractereUrgence > 1) {
			throw new IllegalArgumentException("Caractère d'urgence invalide");
		}
		if (tauxR < 0 || tauxR > 2) {
			throw new IllegalArgumentException(
					"Taux de recommandation invalide");
		}
		if (CaractereUrgence != 1) {
			if (tauxR == 0) {
				return ConstanteAffranchissement;
			} else if (tauxR == 1) {
				return ConstanteAffranchissement + 0.5;
			} else if (tauxR == 2) {
				return ConstanteAffranchissement + 1.5;
			}
		} else {
			if (tauxR == 0) {
				return ConstanteAffranchissement + ConstanteUrgence;
			} else if (tauxR == 1) {
				return ConstanteAffranchissement + ConstanteUrgence + 0.5;
			} else if (tauxR == 2) {
				return ConstanteAffranchissement + ConstanteUrgence + 1.5;
			}
		}
		return 0;

	}

	@Override
	public double Remboursement(int tauxR) {
		if (tauxR == 0) {
			return 0;
		} else if (tauxR == 1) {
			return 1.5;
		}
		return 15;
	}

	@Override
	public String toString(int Code, String Dest, int tauxR, double Volume) {
		return "Lettre ["+Code+"/"+Dest+"/"+tauxR+"/"+this.CaractereUrgence+"]";
	}

}
