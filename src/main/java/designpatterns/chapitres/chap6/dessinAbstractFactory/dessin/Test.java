﻿package designpatterns.chapitres.chap6.dessinAbstractFactory.dessin;

import designpatterns.chapitres.chap6.dessinAbstractFactory.dessin.formesgraphiques.Triangle;

public class Test {

    public static void main(String[] args) {
        Triangle triangle = new Triangle("3D", 10, 0, 10,
                10, 20, 20, 30, 30);
        triangle.dessine();
    }

}
