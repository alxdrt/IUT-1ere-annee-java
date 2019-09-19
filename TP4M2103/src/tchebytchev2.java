
public class tchebytchev2 {


	

		public static void main(String[] args) { 
		
			for (int i=2; i < 10; i++) {

				System.out.println(tchebytchev2.tcb2ndeEspece2(i));
			}


			
			}
		
		public static Polynome tcb2ndeEspece2 (int n) {
			
			
			Polynome Un_1 = new Polynome();
			Polynome Un_2 = new Polynome();
			Polynome Un = new Polynome();
			
			if ( n == 0 ) {
			Un.ajouterM(new Monome(1,0));
			} else if (n == 1 ) {
				Un.ajouterM(new Monome(2,1));
			} else {
				
				Un_1.ajouterM(new Monome(2,1));
				Un_2.ajouterM(new Monome(1,0));
					
				int i = 2;
				while (i<=n) {
				
				Un = Un_1.produitP(new Monome(2,1));
				Un = Un.diff(Un_2);
				Un_2 = Un_1;
				Un_1 = Un;
				i++;
				
				
				}
			}
		
			
		
		
	return Un;

}
}