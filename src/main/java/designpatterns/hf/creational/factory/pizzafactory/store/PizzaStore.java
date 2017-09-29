package designpatterns.hf.creational.factory.pizzafactory.store;

import designpatterns.hf.creational.factory.pizzafactory.pattern.SimplePizzaFactory;
import designpatterns.hf.creational.factory.pizzafactory.pizza.Pizza;

public class PizzaStore {
	SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza;

		pizza = factory.createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
