import java.util.ArrayList;
import java.util.List;


public class SacPostal {

	private List<ObjetPostal> t;
	private float capacite;
	private float volume;

	public SacPostal() {
		this.t = new ArrayList<ObjetPostal>();
		this.capacite = 500F;
		this.volume = 0.5F;
	}

	public SacPostal(float capacite) {
		this.t = new ArrayList<ObjetPostal>();
		this.capacite = capacite;
		this.volume = 0.5F;
	}

	public float getCapacite() {
		return this.capacite;
	}

	public float getVolume() {
		return this.volume;
	}

	public void ajouterObjet(ObjetPostal o) throws RuntimeException{
		float a = this.volume + o.getVolumeEnDm3();
		if (a > this.capacite){
			throw new RuntimeException();
		}
		t.add(o);
		this.volume += o.getVolumeEnDm3();
	}
	
	
	
}
