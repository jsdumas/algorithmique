package dessinAbstractFactory;

import dessinAbstractFactory.BibliothequeGraphique.FabriqueGraphique3D;
import dessinAbstractFactory.formesGraphiques.Triangle;

public class Test {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(
                new FabriqueGraphique3D(10), 10, 10, 20,
                20, 30, 30);
        triangle.dessine();
    }

}
