package designpatterns.chapitres.chap6.dessinAbstractFactory.dessinAbstractFactory;

import designpatterns.chapitres.chap6.dessinAbstractFactory.dessin.formesgraphiques.Triangle;
import designpatterns.chapitres.chap6.dessinAbstractFactory.dessinAbstractFactory.bibliothequegraphique.FabriqueGraphique3D;
//import dessinAbstractFactory.BibliothequeGraphique.FabriqueGraphique3D;
//import dessinAbstractFactory.formesGraphiques.Triangle;

public class Test {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(new FabriqueGraphique3D(10), 10, 10, 20, 20, 30, 30);
        triangle.dessine();
    }

}
