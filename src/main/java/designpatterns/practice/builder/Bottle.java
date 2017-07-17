package pattern.builder;

import pattern.builder.contrat.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}

}
