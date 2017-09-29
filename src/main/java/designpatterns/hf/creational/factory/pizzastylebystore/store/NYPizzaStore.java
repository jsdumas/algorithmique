package designpatterns.hf.creational.factory.pizzastylebystore.store;

import designpatterns.hf.creational.factory.pizzastylebystore.pizza.NYStyleCheesePizza;
import designpatterns.hf.creational.factory.pizzastylebystore.pizza.NYStyleClamPizza;
import designpatterns.hf.creational.factory.pizzastylebystore.pizza.NYStylePepperoniPizza;
import designpatterns.hf.creational.factory.pizzastylebystore.pizza.NYStyleVeggiePizza;
import designpatterns.hf.creational.factory.pizzastylebystore.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else
			return null;
	}
}
