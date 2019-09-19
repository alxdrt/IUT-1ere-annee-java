
public class FibonnaciLineaire extends Fibonacci {

	
	@Override
	public long Compute(int nb) {
	long	fn_1 = 0;
	long 	fn = 1;
	for (int i=0; i<=nb; i++) {
		fn_1 = fn;
		fn = fn + fn_1;
	}
	return fn;
	}
	
	
	
public static void main(String[] args){
		
		long début = System.currentTimeMillis();
		
		Fibonacci f = new FibonnaciLineaire();
		int i;
		for (i = 0; i<50; i++){
			System.out.println(i+" : "+f.Compute(i)+ "   "+(System.currentTimeMillis() - début)+ "ms");
		}
	}
	
}
