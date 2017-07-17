package designpatterns.practice.facade;

import designpatterns.practice.facade.contrat.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}

}
