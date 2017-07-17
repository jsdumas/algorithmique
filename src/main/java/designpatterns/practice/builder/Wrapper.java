package designpatterns.practice.builder;

import designpatterns.practice.builder.contrat.Packing;

public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "Wrapper";
	}

}
