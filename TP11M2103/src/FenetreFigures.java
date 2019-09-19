import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JFrame;

public class FenetreFigures extends JFrame {

    private static final long serialVersionUID = 152948767613356624L;

    public FenetreFigures(List<Figure> figures) {
        this.setTitle("Essais de tracés");
        this.setContentPane(new PanneauFigures(figures));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500, 500);
        this.getContentPane().getGraphics().drawLine(50, 50, 100, 100);
    }

    public void tracerCercle(Cercle c, Graphics g) {
        g.setColor(Color.RED);
        g.drawOval((int) (c.getP1().getX() - c.Rayon()), (int) (c
                .getP1().getX() - c.Rayon()), (int) (c.Diamètre()),
                (int) (c.Diamètre()));
    }

    public void tracerRectangle(Rectangle r, Graphics g) {
        g.setColor(Color.BLUE);
        g.drawRect((int) (r.getP1().getX()), (int) (r.getP1().getY()),
                (int) (r.Longueur()), (int) (r.Largeur()));
    }

}
