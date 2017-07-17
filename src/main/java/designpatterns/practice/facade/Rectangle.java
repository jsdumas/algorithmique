package pattern.facade;

import pattern.facade.contrat.Shape;

public class Rectangle implements Shape {

	public void draw() {
		System.out.println("Rectangle::draw()");
	}

}
