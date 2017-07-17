package pattern.facade;

import pattern.facade.contrat.Shape;

public class Square implements Shape {

	public void draw() {
		System.out.println("Square::draw()");
	}

}
