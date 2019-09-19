package testPartiel2013;

import java.util.ArrayList;
import java.util.List;

public class Sac {

	private List<ObjetPostal> tabSac;

	public Sac() {
		this.tabSac = new ArrayList<ObjetPostal>();
	}

	public void ajout() {
		this.tabSac.add(new Colis(null, null, 0, 0, 0, 0, null, 0));

	}

}
