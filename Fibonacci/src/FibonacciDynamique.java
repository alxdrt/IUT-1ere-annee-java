import java.util.HashMap;
import java.util.Map;


public class FibonacciDynamique extends Fibonacci {
	
	
	private static Map<Integer,Long> map = new HashMap<Integer,Long>();

	@Override
	public long Compute(int nb) {
	if (nb <= 0) {
	return 0L;
	}
	if (nb == 1 || nb == 2) {
	return 1L;
	}

	Long valeur = map.get(nb);

	if (valeur != null) {
	return valeur;
	}
	else {
	valeur = Compute(nb-1) + Compute(nb-2);
	map.put(nb,valeur);
	return valeur;
	}
	}
	
	
public static void main(String[] args){
		
		long début = System.currentTimeMillis();
		
		Fibonacci f = new FibonacciDynamique();
		int i;
		for (i = 0; i<50; i++){
			System.out.println(i+" : "+f.Compute(i)+ "   "+(System.currentTimeMillis() - début)+ "ms");
		}
	}


	
}
