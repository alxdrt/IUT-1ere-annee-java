import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

public class PanneauFigures extends JPanel {
    private static final long serialVersionUID = -5633501983987020072L;
    private List<Figure> figures;

    public PanneauFigures(List<Figure> figures) {
        this.figures = figures;
    }

    public void paint(Graphics g) {
        Color[] tableauCouleur = { Color.RED, Color.BLACK, Color.BLUE,
                Color.GREEN, Color.MAGENTA, Color.ORANGE, Color.PINK };
        int i = 0;
        for (Figure f : this.figures) {
            g.setColor(tableauCouleur[i % 10]);
            if (f instanceof Rectangle) {
                Rectangle r = (Rectangle) f;
                this.tracerRectangle(r, g);
            } else {
                Cercle c = (Cercle) f;
                this.tracerCercle(c, g);
            }
            i++;
        }

    }

    public void tracerCercle(Cercle c, Graphics g) {
        g.drawOval((int) (c.getP1().getX() - c.Rayon()), (int) (c
                .getP1().getX() - c.Rayon()), (int) (c.Diamètre()),
                (int) (c.Diamètre()));
    }

    public void tracerRectangle(Rectangle r, Graphics g) {
        g.drawRect((int) (r.getP1().getX()), (int) (r.getP1().getY()),
                (int) (r.Longueur()), (int) (r.Largeur()));
    }

}
