
public class FibonnaciRecursifTerminal{
	
	
	public long Compute(int nb, int fn_1, int fn) {
		if (nb == 0)
			{
			return fn_1;
			}
		else {
			return Compute(nb-1,fn, fn+fn_1);
		}
	}
	
	
public static void main(String[] args){
		
		long début = System.currentTimeMillis();
		
	    FibonnaciRecursifTerminal f = new FibonnaciRecursifTerminal();
		int i;
		for (i = 0; i<50; i++){
			System.out.println(i+" : "+f.Compute(i,0,1)+ "   "+(System.currentTimeMillis() - début)+ "ms");
		}
	}


	
}
