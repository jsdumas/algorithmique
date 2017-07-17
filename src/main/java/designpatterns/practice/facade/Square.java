package designpatterns.practice.facade;

import designpatterns.practice.facade.contrat.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square::draw()");
	}

}
