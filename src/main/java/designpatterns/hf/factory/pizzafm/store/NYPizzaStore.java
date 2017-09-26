package designpatterns.hf.factory.pizzafm.store;

import designpatterns.hf.factory.pizzafm.pizza.NYStyleCheesePizza;
import designpatterns.hf.factory.pizzafm.pizza.NYStyleClamPizza;
import designpatterns.hf.factory.pizzafm.pizza.NYStylePepperoniPizza;
import designpatterns.hf.factory.pizzafm.pizza.NYStyleVeggiePizza;
import designpatterns.hf.factory.pizzafm.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}
