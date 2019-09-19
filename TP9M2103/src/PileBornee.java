public class PileBornee<T> {
	private final int maxSize;
	private int size;
	private Cellule top;
	

	public PileBornee(int n) {
		this.maxSize = n;
		this.size = 0;
		this.top = null;
	}

	public boolean isEmpty() {
		return (this.size == 0);
	}

	public void push(int valeur) throws FullStack {
		if (this.size < this.maxSize){
			Cellule top = new Cellule(valeur,this.top);
			this.top = top;
			this.size+=1;
		} else {
		throw new FullStack("La pile est pleine, on ne peut pas l'empiler");
		}
	}

	public int getMaxSize() {
		return this.maxSize;
	}

	public int getSize() {
		return this.size;
	}

	public boolean isFull() {
		return (this.size == this.maxSize); 
	}
	
	public int top() throws EmptyStackException {
		if (this.isEmpty())
			throw new EmptyStackException("La pile est vide, top impossible");
		return top.valeur;
	}

	public void pop() throws EmptyStackException {
		if (this.isEmpty()){
			throw new EmptyStackException("La pile est vide, pop impossible");
		} else {
			this.top = top.suivant;
			this.size-=1;
		}
	}
	
	private class Cellule {
		public int valeur;
		public Cellule suivant;
		public Cellule(int valeur, Cellule suivant) {
			this.valeur = valeur;
			this.suivant = suivant;
		}
	}

	@Override
	public String toString() {
		String result = "PileBornee [maxSize = " + this.maxSize + ", size = " + this.size + ", elements = ";
		Cellule enCours = top;
		while(enCours != null) {
			result+= enCours.valeur + " ";
			enCours = enCours.suivant;
		}
		result += ']';
		return result;
	}

	
}
