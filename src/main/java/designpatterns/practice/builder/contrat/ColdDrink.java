package designpatterns.practice.builder.contrat;

import designpatterns.practice.builder.Bottle;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
