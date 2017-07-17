package designpatterns.practice.facade;

import designpatterns.practice.facade.contrat.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle::draw()");
	}

}
