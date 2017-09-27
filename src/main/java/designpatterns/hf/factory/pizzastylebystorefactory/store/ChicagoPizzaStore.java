package designpatterns.hf.factory.pizzastylebystorefactory.store;

import designpatterns.hf.factory.pizzastylebystorefactory.pattern.ChicagoPizzaIngredientFactory;
import designpatterns.hf.factory.pizzastylebystorefactory.pattern.PizzaIngredientFactory;
import designpatterns.hf.factory.pizzastylebystorefactory.pizza.CheesePizza;
import designpatterns.hf.factory.pizzastylebystorefactory.pizza.ClamPizza;
import designpatterns.hf.factory.pizzastylebystorefactory.pizza.PepperoniPizza;
import designpatterns.hf.factory.pizzastylebystorefactory.pizza.Pizza;
import designpatterns.hf.factory.pizzastylebystorefactory.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}
