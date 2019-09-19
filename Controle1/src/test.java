
public class test {

	public static void main(String[] args) {

	 Polynome p1 = new Polynome();
	 Polynome p2 = new Polynome();
	 p1.ajouterMonome(new Monome (-3,2));
	 p1.ajouterMonome(new Monome (4,1));
	 p1.ajouterMonome(new Monome (-2,0));
	 
	 p2.ajouterMonome(new Monome (1,3));
	 p2.ajouterMonome(new Monome (-1,1));
	 p2.ajouterMonome(new Monome (1,0));
	
	 
	 System.out.println(p1.produitP(p2));
	}

}
