package designpatterns.hf.factory.pizzastylebystorefactory.pattern;

import designpatterns.hf.factory.pizzastylebystorefactory.ingredient.Cheese;
import designpatterns.hf.factory.pizzastylebystorefactory.ingredient.Clams;
import designpatterns.hf.factory.pizzastylebystorefactory.ingredient.Dough;
import designpatterns.hf.factory.pizzastylebystorefactory.ingredient.Pepperoni;
import designpatterns.hf.factory.pizzastylebystorefactory.ingredient.Sauce;
import designpatterns.hf.factory.pizzastylebystorefactory.ingredient.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
