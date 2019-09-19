/**
 * 
 * @author tnl1799a
 *
 */




public class Polynome{

	

	
/**
 *@ polynomeNul cr�ation du polynome
 */
	
private Monome [] tab = new Monome[100];

public static final int NB_MAX_MONOMES = 100;

public Polynome (){
	this.tab = new Monome [Polynome.NB_MAX_MONOMES];
	for (int i=0; i < this.tab.length; i++) {
	this.tab[i] = new Monome(0,i);
	}
}


/**
*@return La somme de deux polynomes
*/


public Polynome sommeP(Polynome p1) {
    int i = 0;
    Polynome p2 = new Polynome();
	while ( i < this.tab.length){
		p2.tab[i] = this.tab[i].somme(p1.tab[i]);	
		i++;
	}
	return p2;
}

/**
*@return Le produit d'un polyn�me au Mon�me m
*@param m Le monome que l'on multiplie au polynome
*/

public Polynome produitP(Monome m) {
	 int i = 0;
	   Polynome p2 = new Polynome();
		while ( i < this.tab.length - 1){
          p2.tab[this.tab[i].produit(m).getExposant()] = this.tab[i].produit(m);
			i++;
		}
	
	return p2;
}

/**
*@return La d�riv�e du Polynome
*
*/

public Polynome d�riv�eP() {
	 int i = 0;
	   Polynome p2 = new Polynome();
		while ( i < this.tab.length){
        p2.tab[this.tab[i].d�riv�e().getExposant()] = this.tab[i].d�riv�e();
			i++;
		}
		return p2;
}


/**
*@return L'ajout d'un Monome au polynome
*
*/

public void ajouterM(Monome m) {
    this.tab[m.getExposant()]= this.tab[m.getExposant()].somme(m);
}


@Override
public String toString() {
    String r�sultat = "";
    int i = this.tab.length - 1;
    while (i >= 0 && this.tab[i].estNul()) {
        i--;
    }
    if (i == -1) {
        r�sultat += "0";
    } else {
        r�sultat += this.tab[i];
        i--;
    }
    while (i >= 0) {
        if (!this.tab[i].estNul()) {
            if (this.tab[i].getCoefficient() < 0) {
                r�sultat += " - "
                        + new Monome(-this.tab[i].getCoefficient(),
                                this.tab[i].getExposant());
            } else {
                r�sultat += " + " + this.tab[i];
            }
        }
        i--;
    }
    return r�sultat;

}

public int degr�(){
	int a = 0;
for (int i=0; i < tab.length; i++){

	if (this.tab[i].getCoefficient() != 0) {
	a = this.tab[i].getExposant();	
	}
}
return a;
}

public Polynome diff(Polynome p1) {
	 int i = 0;
	    Polynome p2 = new Polynome();
		while ( i < this.tab.length){
			p2.tab[i] = this.tab[i].diff�rence(p1.tab[i]);	
			i++;
		}
		return p2;
}



}






























	

