package testPartiel2013;

public abstract class ObjetPostal {

	private String Origine, Destination;
	private int CodePostal, tauxRecommandation;
	private double Volume, Poids;

	public ObjetPostal(String Ori, String Dest, int Code, int tauxR,
			double Vol, double Poids) {
		this.Origine = Ori;
		this.Destination = Dest;
		this.CodePostal = Code;
		this.tauxRecommandation = tauxR;
		this.Volume = Vol;
		this.Poids = Poids;

	}

	public abstract double Affranchissement(int tauxR, double Volume);

	public abstract double Remboursement(int tauxR);

	public abstract String toString(int Code, String Dest, int tauxR, double Volume);
}
