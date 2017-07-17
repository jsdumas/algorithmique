package designpatterns.practice.builder;

import designpatterns.practice.builder.contrat.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}

}
