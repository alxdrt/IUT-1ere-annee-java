
public class Rectangle extends Figure {

	public Rectangle (Point p1, Point p2) {
		super(p1,p2);
	}

	public double Longueur() {
		return (Math.abs(this.getP1().getX()-this.getP2().getX()));
	}

	public double Largeur() {
		return (Math.abs(this.getP1().getY()-this.getP2().getY()));
	}

	@Override
	
	public double Périmètre() {		
		return 2 * (this.Longueur() + this.Largeur());
	}

	@Override
	
	public double Surface() {
		return (this.Longueur() * this.Largeur());
	}

		
}
