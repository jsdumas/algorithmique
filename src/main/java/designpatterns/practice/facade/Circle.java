package pattern.facade;

import pattern.facade.contrat.Shape;

public class Circle implements Shape {

	public void draw() {
		System.out.println("Circle::draw()");
	}

}
