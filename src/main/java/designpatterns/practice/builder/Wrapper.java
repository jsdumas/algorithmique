package pattern.builder;

import pattern.builder.contrat.Packing;

public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "Wrapper";
	}

}
