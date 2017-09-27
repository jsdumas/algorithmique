package designpatterns.hf.factory.pizzastylebystore.store;

import designpatterns.hf.factory.pizzastylebystore.pizza.ChicagoStyleCheesePizza;
import designpatterns.hf.factory.pizzastylebystore.pizza.ChicagoStyleClamPizza;
import designpatterns.hf.factory.pizzastylebystore.pizza.ChicagoStylePepperoniPizza;
import designpatterns.hf.factory.pizzastylebystore.pizza.ChicagoStyleVeggiePizza;
import designpatterns.hf.factory.pizzastylebystore.pizza.Pizza;

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
