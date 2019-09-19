/**
 * 
 * @author tnl1799a
 *
 */

public class Polynome {
    public static final int NB_MAX_MONOMES = 100;
    private Monome[] tabMonomes;

    public Polynome() {
        this.tabMonomes = new Monome[Polynome.NB_MAX_MONOMES];
        for (int i = 0; i < this.tabMonomes.length; i++) {
            this.tabMonomes[i] = new Monome(0.0F, i);
        }
    }

    public void ajouterMonome(Monome m) throws IllegalArgumentException {
       
        this.tabMonomes[m.getExposant()] = this.tabMonomes[m.getExposant()]
                .somme(m);
    }

    public Polynome d�riv�e() {
        Polynome r�sultat = new Polynome();
        for (int i = 0; i < this.tabMonomes.length; i++) {
            r�sultat.ajouterMonome(this.tabMonomes[i].d�riv�e());
        }
        return r�sultat;
    }

    public Polynome somme(Polynome p) {
        Polynome r�sultat = new Polynome();
        for (int i = 0; i < this.tabMonomes.length; i++) {
            r�sultat.ajouterMonome(this.tabMonomes[i]);
            r�sultat.ajouterMonome(p.tabMonomes[i]);
        }
        return r�sultat;
    }

    public Polynome diff(Polynome p) {
        Polynome r�sultat = new Polynome();
        for (int i = 0; i < this.tabMonomes.length; i++) {
            r�sultat.ajouterMonome(this.tabMonomes[i]);
            r�sultat.ajouterMonome(new Monome(
                    -p.tabMonomes[i].getCoefficient(), p.tabMonomes[i]
                            .getExposant()));
        }
        return r�sultat;
    }

    public Polynome produit(Monome m) throws IllegalArgumentException {
        Polynome r�sultat = new Polynome();
        for (int i = 0; i < this.tabMonomes.length; i++) {
            if (!this.tabMonomes[i].estNul()) {
                r�sultat.ajouterMonome(this.tabMonomes[i].produit(m));
            }
        }
        return r�sultat;
        
    
         }
    
    /**
     * La m�thode produitP multiplie deu polyn�mes
     * 
     * @param P le polyn�me que l'on multiplie � l'instance courante
     *  
     * @exception Si l'exposant est plus grand que le nombre de cases du tableau, on l�ve l'exception
     *  
     * @return Retourne le polynome R�sultat qui est le r�sultat de la multiplication
     *  
     */
    
        public Polynome produitP(Polynome P) throws IllegalArgumentException {
            Polynome r�sultat = new Polynome();
            for (int i = 0; i < this.tabMonomes.length; i++) {
                if (!this.tabMonomes[i].estNul()) {
                	
                    for (int j = 0; j < this.tabMonomes.length; j++) {
                	
                    	r�sultat.ajouterMonome(new Monome(this.tabMonomes[i].getCoefficient() * P.tabMonomes[j].getCoefficient(), this.tabMonomes[i].getExposant() + (P.tabMonomes[j].getExposant())));
                    }
                }
            }
            return r�sultat;
        

    }

    public int degr�() throws RuntimeException {
        for (int i = this.tabMonomes.length - 1; i >= 0; i--) {
            if (!this.tabMonomes[i].estNul()) {
                return i;
            }
        }
        throw new RuntimeException("polynome nul - degr� impossible � calculer");
    }

    @Override
    public String toString() {
        String r�sultat = "";
        int i = this.tabMonomes.length - 1;
        while (i >= 0 && this.tabMonomes[i].estNul()) {
            i--;
        }
        if (i == -1) {
            r�sultat += "0";
        } else {
            r�sultat += this.tabMonomes[i];
            i--;
        }
        while (i >= 0) {
            if (!this.tabMonomes[i].estNul()) {
                if (this.tabMonomes[i].getCoefficient() < 0) {
                    r�sultat += " - "
                            + new Monome(-this.tabMonomes[i].getCoefficient(),
                                    this.tabMonomes[i].getExposant());
                } else {
                    r�sultat += " + " + this.tabMonomes[i];
                }
            }
            i--;
        }
        return r�sultat;
    }

}
