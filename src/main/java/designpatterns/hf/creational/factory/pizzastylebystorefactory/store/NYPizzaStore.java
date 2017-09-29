package designpatterns.hf.creational.factory.pizzastylebystorefactory.store;

import designpatterns.hf.creational.factory.pizzastylebystorefactory.pattern.NYPizzaIngredientFactory;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.pattern.PizzaIngredientFactory;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.pizza.CheesePizza;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.pizza.ClamPizza;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.pizza.PepperoniPizza;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.pizza.Pizza;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");

		}
		return pizza;
	}
}
