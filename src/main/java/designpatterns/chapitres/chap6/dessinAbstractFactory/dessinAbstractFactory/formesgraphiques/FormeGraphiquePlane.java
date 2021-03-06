﻿package designpatterns.chapitres.chap6.dessinAbstractFactory.dessinAbstractFactory.formesgraphiques;

import java.util.ArrayList;
import java.util.List;

import designpatterns.chapitres.chap6.dessinAbstractFactory.dessin.bibliothequegraphique.Point;
import designpatterns.chapitres.chap6.dessinAbstractFactory.dessinAbstractFactory.bibliothequegraphique.FabriqueGraphique;
//import dessinAbstractFactory.BibliothequeGraphique.Point;
//import dessinAbstractFactory.BibliothequeGraphique.FabriqueGraphique;

public abstract class FormeGraphiquePlane {
    protected List<Point> points = new ArrayList<Point>();
    protected FabriqueGraphique fabriqueGraphique;

    public FormeGraphiquePlane(
            FabriqueGraphique fabriqueGraphique) {
        super();
        this.fabriqueGraphique = fabriqueGraphique;
    }

    public void ajoutePoint(int x, int y) {
        Point nouveauPoint = (Point) fabriqueGraphique.creePoint(x, y);
        points.add(nouveauPoint);
    }

    abstract public void dessine();
}
