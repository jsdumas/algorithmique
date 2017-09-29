package designpatterns.hf.creational.factory.pizzafactory.pattern;

import designpatterns.hf.creational.factory.pizzafactory.pizza.CheesePizza;
import designpatterns.hf.creational.factory.pizzafactory.pizza.ClamPizza;
import designpatterns.hf.creational.factory.pizzafactory.pizza.PepperoniPizza;
import designpatterns.hf.creational.factory.pizzafactory.pizza.Pizza;
import designpatterns.hf.creational.factory.pizzafactory.pizza.VeggiePizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
