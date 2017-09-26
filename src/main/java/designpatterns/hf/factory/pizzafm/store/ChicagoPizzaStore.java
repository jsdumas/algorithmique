package designpatterns.hf.factory.pizzafm.store;

import designpatterns.hf.factory.pizzafm.pizza.ChicagoStyleCheesePizza;
import designpatterns.hf.factory.pizzafm.pizza.ChicagoStyleClamPizza;
import designpatterns.hf.factory.pizzafm.pizza.ChicagoStylePepperoniPizza;
import designpatterns.hf.factory.pizzafm.pizza.ChicagoStyleVeggiePizza;
import designpatterns.hf.factory.pizzafm.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new ChicagoStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new ChicagoStyleVeggiePizza();
        	} else if (item.equals("clam")) {
        	    	return new ChicagoStyleClamPizza();
        	} else if (item.equals("pepperoni")) {
            		return new ChicagoStylePepperoniPizza();
        	} else return null;
	}
}
