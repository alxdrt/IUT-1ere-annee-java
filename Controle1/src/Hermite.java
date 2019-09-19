
public class Hermite {

	public static void main(String[] args) {
		Polynome H = new Polynome();
	
	

	for (int i=0; i <= 9; i++) {
		if ( i == 0 ) {
			H.ajouterMonome(new Monome(1,0));
				} else if (i == 1 ) {
			H.ajouterMonome(new Monome(1,1));
				} else {
					int j = 2;
					while (j<=9) {
					
					H.ajouterMonome(new Monome(1,1));
					H = H.différence(new Monome(i,i-1));
					
					j++;
				
	}
	}

}
	}
}
