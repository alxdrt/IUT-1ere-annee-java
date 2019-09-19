public class Monome {

    /**
     * coefficient du monôme
     */
    private float coefficient;

    /**
     * exposant du monôme
     */
    private int exposant;

    /**
     * construit un monôme
     * 
     * @param coefficient
     *            coefficient du monôme
     * @param exposant
     *            exposant du monôme
     * @exception IllegalArgumentException
     *                si l'exposant est négatif
     */
    public Monome(float coefficient, int exposant)
            throws IllegalArgumentException {
    	if (this.exposant <= 0) {
    		throw new IllegalArgumentException ("Exposant <= 0"); 
    	}
    this.coefficient = coefficient;
    this.exposant = exposant;

    }

    /**
     * retourne le coefficient d'un monôme
     * 
     * @return coefficient
     */
    public float getCoefficient() {
        return this.coefficient;
    }

    /**
     * retourne l'exposant d'un monôme
     * 
     * @return exposant
     */
    public int getExposant() {
        return this.exposant;
    }

    /**
     * calcule la somme de deux monômes
     * 
     * @param m
     *            deuxième opérande de la somme
     * @return monôme résultat
     * @exception ArithmeticException
     *                si les exposants des 2 monômes ne sont pas les mêmes
     */

	public Monome somme(Monome m) throws ArithmeticException {
       Monome p = new Monome(0,0);
       if (m.exposant != this.exposant ) {
    	   throw new ArithmeticException ("Exposants pas égaux");
       }
    p.coefficient= this.coefficient + m.coefficient;
    p.exposant = this.exposant;
    	return p;
    }

    /**
     * calcule le produit de deux monômes
     * 
     * @param m
     *            deuxième opérande du produit
     * @return monôme résultat
     */

	public Monome produit(Monome m) {
    	 Monome x = new Monome(0,0);
       x.coefficient = this.coefficient * m.coefficient;
       x.exposant = this.exposant + m.exposant;
       return x;
    }

    /**
     * calcule la dérivée d'un monôme
     * 
     * @return monôme résultat
     */
    public Monome dérivée() {
    	Monome d = new Monome(0,0);
    	d.coefficient = this.coefficient * this.exposant;
    	d.exposant = this.exposant - 1;
        return d;
    }

    /**
     * produit une version unicode d'un monôme
     * 
     * @return chaîne résultat
     */
    @Override
    public String toString() {
        if (this.estNul()) {
            return "0";
        } else {
            if (this.exposant == 0) {
                return "" + this.getCoefficient();
            }
            return "" + this.getCoefficient() + "xe" + this.getExposant();
        }
    }

    /**
     * teste si un monôme est nul
     * 
     * @return true si le monôme est nul
     */
    public boolean estNul() {
        return true;
    }
    
    
  
    	
    }
    	



