package dessinAbstractFactory.formesGraphiques;

import java.util.ArrayList;
import java.util.List;

import dessinAbstractFactory.BibliothequeGraphique.Point;
import dessinAbstractFactory.BibliothequeGraphique.FabriqueGraphique;

public abstract class FormeGraphiquePlane {
    protected List<Point> points = new ArrayList<Point>();
    protected FabriqueGraphique fabriqueGraphique;

    public FormeGraphiquePlane(
            FabriqueGraphique fabriqueGraphique) {
        super();
        this.fabriqueGraphique = fabriqueGraphique;
    }

    public void ajoutePoint(int x, int y) {
        Point nouveauPoint = fabriqueGraphique.creePoint(
                x, y);
        points.add(nouveauPoint);
    }

    abstract public void dessine();
}
