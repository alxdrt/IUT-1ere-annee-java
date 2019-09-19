public class Monome {

    /**
     * coefficient du mon�me
     */
    private float coefficient;

    /**
     * exposant du mon�me
     */
    private int exposant;

    /**
     * construit un mon�me
     * 
     * @param coefficient
     *            coefficient du mon�me
     * @param exposant
     *            exposant du mon�me
     * @exception IllegalArgumentException
     *                si l'exposant est n�gatif
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
     * retourne le coefficient d'un mon�me
     * 
     * @return coefficient
     */
    public float getCoefficient() {
        return this.coefficient;
    }

    /**
     * retourne l'exposant d'un mon�me
     * 
     * @return exposant
     */
    public int getExposant() {
        return this.exposant;
    }

    /**
     * calcule la somme de deux mon�mes
     * 
     * @param m
     *            deuxi�me op�rande de la somme
     * @return mon�me r�sultat
     * @exception ArithmeticException
     *                si les exposants des 2 mon�mes ne sont pas les m�mes
     */

	public Monome somme(Monome m) throws ArithmeticException {
       Monome p = new Monome(0,0);
       if (m.exposant != this.exposant ) {
    	   throw new ArithmeticException ("Exposants pas �gaux");
       }
    p.coefficient= this.coefficient + m.coefficient;
    p.exposant = this.exposant;
    	return p;
    }

    /**
     * calcule le produit de deux mon�mes
     * 
     * @param m
     *            deuxi�me op�rande du produit
     * @return mon�me r�sultat
     */

	public Monome produit(Monome m) {
    	 Monome x = new Monome(0,0);
       x.coefficient = this.coefficient * m.coefficient;
       x.exposant = this.exposant + m.exposant;
       return x;
    }

    /**
     * calcule la d�riv�e d'un mon�me
     * 
     * @return mon�me r�sultat
     */
    public Monome d�riv�e() {
    	Monome d = new Monome(0,0);
    	d.coefficient = this.coefficient * this.exposant;
    	d.exposant = this.exposant - 1;
        return d;
    }

    /**
     * produit une version unicode d'un mon�me
     * 
     * @return cha�ne r�sultat
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
     * teste si un mon�me est nul
     * 
     * @return true si le mon�me est nul
     */
    public boolean estNul() {
        return true;
    }
    
    
  
    	
    }
    	



