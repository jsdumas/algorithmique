package designpatterns.hf.factory.pizzafactory.app;

import designpatterns.hf.factory.pizzafactory.pattern.SimplePizzaFactory;
import designpatterns.hf.factory.pizzafactory.pizza.Pizza;
import designpatterns.hf.factory.pizzafactory.store.PizzaStore;

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