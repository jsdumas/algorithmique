﻿package dessin.formesGraphiques;

import java.util.ArrayList;
import java.util.List;

import dessin.BibliothequeGraphique.Point;
import dessin.BibliothequeGraphique.Point2D;
import dessin.BibliothequeGraphique.Point3D;
import dessin.BibliothequeGraphique.Point3DCouleur;

public abstract class FormeGraphiquePlane {
    protected List<Point> points = new ArrayList<Point>();
    protected String typeBibliothequeGraphique = "2D";
    protected int zPoint = 0;
    protected int couleurPoint = 0;

    public FormeGraphiquePlane(
            String typeBibliothequeGraphique, int zPoint,
            int couleurPoint) {
        super();
        this.typeBibliothequeGraphique = typeBibliothequeGraphique;
        this.zPoint = zPoint;
        this.couleurPoint = couleurPoint;
    }

    public void ajoutePoint(int x, int y) {
        Point nouveauPoint;
        if (typeBibliothequeGraphique.equals("2D")) {
            nouveauPoint = new Point2D(x, y);
        } else if (typeBibliothequeGraphique.equals("3D")) {
            nouveauPoint = new Point3D(x, y, zPoint);
        } else if (typeBibliothequeGraphique
                .equals("3DCouleur")) {
            nouveauPoint = new Point3DCouleur(x, y,
                    zPoint, couleurPoint);
        } else {
            nouveauPoint = new Point2D(x, y);
        }
        points.add(nouveauPoint);
    }

    abstract public void dessine();
}