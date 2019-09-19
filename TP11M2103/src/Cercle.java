public class Cercle extends Figure {

	public Cercle (Point p1, Point p2) {
		
		super(p1,p2);
		
	}

	public double Rayon() {
		return Point.distance(this.getP1(),this.getP2());
	}

	public double Diamètre() {
		return 2 * Point.distance(this.getP1(), this.getP2());
	}

	@Override

	public double Périmètre() {		
		return 2 * Math.PI * Point.distance(this.getP1(), this.getP2());
	}

	@Override
	
	public double Surface() {
		return Math.PI * Math.pow(Point.distance(this.getP1(), this.getP2()),2);
	}

		
}

