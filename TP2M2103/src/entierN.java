import java.util.Scanner;


public class entierN {

	public static void main(String[] args) {
	Scanner clavier = new Scanner (System.in);
	System.out.println("Entrez n :"); // nombre d'étoiles a afficher
	int n = clavier.nextInt();
	String a; //étoiles

	clavier.close();

	System.out.println("Valeur de n :"+n);
	// x compteur

	for (int x=0; x < 1; x++ ) {
		
		a = "*";
		for (int c=0; c < n; c++ ) {
	System.out.println(a);
	a = a +"*";
		}
		
	a = "*";

		for (int b=0; b < n; b++ ) {
			System.out.println(" "+a);
			a = a +"*";
	
	}

	
		
	}
	}
}