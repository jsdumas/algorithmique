package designpatterns.practice.builder.contrat;

import designpatterns.practice.builder.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
