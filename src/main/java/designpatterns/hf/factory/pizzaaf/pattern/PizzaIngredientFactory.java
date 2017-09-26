package designpatterns.hf.factory.pizzaaf.pattern;

import designpatterns.hf.factory.pizzaaf.ingredient.Cheese;
import designpatterns.hf.factory.pizzaaf.ingredient.Clams;
import designpatterns.hf.factory.pizzaaf.ingredient.Dough;
import designpatterns.hf.factory.pizzaaf.ingredient.Pepperoni;
import designpatterns.hf.factory.pizzaaf.ingredient.Sauce;
import designpatterns.hf.factory.pizzaaf.ingredient.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
