package designpatterns.practice.builder;

import designpatterns.practice.builder.contrat.ColdDrink;

public class Coke extends ColdDrink {

	@Override
	public float price() {
		return 30.0f;
	}

	@Override
	public String name() {
		return "Coke";
	}

}
