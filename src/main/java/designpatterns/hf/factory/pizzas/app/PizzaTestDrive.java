package designpatterns.hf.factory.pizzas.app;

import designpatterns.hf.factory.pizzas.pattern.SimplePizzaFactory;
import designpatterns.hf.factory.pizzas.pizza.Pizza;
import designpatterns.hf.factory.pizzas.store.PizzaStore;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
 
		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
	}
}
