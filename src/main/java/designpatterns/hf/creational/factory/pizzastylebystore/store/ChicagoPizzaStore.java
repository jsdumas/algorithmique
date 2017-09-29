package designpatterns.hf.creational.factory.pizzastylebystore.store;

import designpatterns.hf.creational.factory.pizzastylebystore.pizza.ChicagoStyleCheesePizza;
import designpatterns.hf.creational.factory.pizzastylebystore.pizza.ChicagoStyleClamPizza;
import designpatterns.hf.creational.factory.pizzastylebystore.pizza.ChicagoStylePepperoniPizza;
import designpatterns.hf.creational.factory.pizzastylebystore.pizza.ChicagoStyleVeggiePizza;
import designpatterns.hf.creational.factory.pizzastylebystore.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new ChicagoStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else
			return null;
	}
}
