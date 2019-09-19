import java.math.*;
public class tchebytchev {

	

	
	public static void main(String[] args) { 
	for (int i=0; i < 10; i++) {
		System.out.println(tchebytchev.tcb2ndeEspece(i));
	}

	
	}

	public static int factorielle (int n) {
		int f=1;
		for (int i = 1; i <= n; i++) {
			f*=i;
		}	
	return f;
	}



	public static Polynome tcb2ndeEspece (int n) {
		Polynome résultat = new Polynome();
		if (n == 0) {
			résultat.ajouterM(new Monome(1.0F,0 ));
		return résultat; 
			} 
		for (int k=0; k <= n/2; k++) {
			double b = Math.pow(-1,k);
			int c = tchebytchev.factorielle(n-k);
			int d = tchebytchev.factorielle(k);
			int e = tchebytchev.factorielle(n-2*k);
			double a = b * (c / (d*e)) * Math.pow(2, n-2*k);
			Monome res = new Monome((float)a,n-2*k);
			résultat.ajouterM(res);
			
		
		}
		return résultat;
	}
}
