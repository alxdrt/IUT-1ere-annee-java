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

    public Polynome dérivée() {
        Polynome résultat = new Polynome();
        for (int i = 0; i < this.tabMonomes.length; i++) {
            résultat.ajouterMonome(this.tabMonomes[i].dérivée());
        }
        return résultat;
    }

    public Polynome somme(Polynome p) {
        Polynome résultat = new Polynome();
        for (int i = 0; i < this.tabMonomes.length; i++) {
            résultat.ajouterMonome(this.tabMonomes[i]);
            résultat.ajouterMonome(p.tabMonomes[i]);
        }
        return résultat;
    }

    public Polynome diff(Polynome p) {
        Polynome résultat = new Polynome();
        for (int i = 0; i < this.tabMonomes.length; i++) {
            résultat.ajouterMonome(this.tabMonomes[i]);
            résultat.ajouterMonome(new Monome(
                    -p.tabMonomes[i].getCoefficient(), p.tabMonomes[i]
                            .getExposant()));
        }
        return résultat;
    }

    public Polynome produit(Monome m) throws IllegalArgumentException {
        Polynome résultat = new Polynome();
        for (int i = 0; i < this.tabMonomes.length; i++) {
            if (!this.tabMonomes[i].estNul()) {
                résultat.ajouterMonome(this.tabMonomes[i].produit(m));
            }
        }
        return résultat;
        
    
         }
    
    /**
     * La méthode produitP multiplie deu polynômes
     * 
     * @param P le polynôme que l'on multiplie à l'instance courante
     *  
     * @exception Si l'exposant est plus grand que le nombre de cases du tableau, on lève l'exception
     *  
     * @return Retourne le polynome Résultat qui est le résultat de la multiplication
     *  
     */
    
        public Polynome produitP(Polynome P) throws IllegalArgumentException {
            Polynome résultat = new Polynome();
            for (int i = 0; i < this.tabMonomes.length; i++) {
                if (!this.tabMonomes[i].estNul()) {
                	
                    for (int j = 0; j < this.tabMonomes.length; j++) {
                	
                    	résultat.ajouterMonome(new Monome(this.tabMonomes[i].getCoefficient() * P.tabMonomes[j].getCoefficient(), this.tabMonomes[i].getExposant() + (P.tabMonomes[j].getExposant())));
                    }
                }
            }
            return résultat;
        

    }

    public int degré() throws RuntimeException {
        for (int i = this.tabMonomes.length - 1; i >= 0; i--) {
            if (!this.tabMonomes[i].estNul()) {
                return i;
            }
        }
        throw new RuntimeException("polynome nul - degré impossible à calculer");
    }

    @Override
    public String toString() {
        String résultat = "";
        int i = this.tabMonomes.length - 1;
        while (i >= 0 && this.tabMonomes[i].estNul()) {
            i--;
        }
        if (i == -1) {
            résultat += "0";
        } else {
            résultat += this.tabMonomes[i];
            i--;
        }
        while (i >= 0) {
            if (!this.tabMonomes[i].estNul()) {
                if (this.tabMonomes[i].getCoefficient() < 0) {
                    résultat += " - "
                            + new Monome(-this.tabMonomes[i].getCoefficient(),
                                    this.tabMonomes[i].getExposant());
                } else {
                    résultat += " + " + this.tabMonomes[i];
                }
            }
            i--;
        }
        return résultat;
    }

}
