import java.util.ArrayList;
import java.util.List;


public class Application {



	public static void main(String[] args) {





		Point p1 = new Point(60,12);
		Point p2 = new Point(85,48);

		Cercle c1 = new Cercle(p1, p2);
		Rectangle r1 = new Rectangle(p1, p2);

		Cercle c2 = new Cercle(p2, p1);
		Rectangle r2 = new Rectangle(p2, p1);

		List<Figure> fig = new ArrayList<Figure>();
		FenetreFigures F = new FenetreFigures(fig);

		fig.add(c1);
		System.out.println(c1);
		fig.add(r1);
		System.out.println(c2);
		fig.add(c2);
		System.out.println(r1);
		fig.add(r2);
		System.out.println(r2);

	}

}
