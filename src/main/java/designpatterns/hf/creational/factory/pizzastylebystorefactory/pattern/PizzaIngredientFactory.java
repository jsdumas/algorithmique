package designpatterns.hf.creational.factory.pizzastylebystorefactory.pattern;

import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Cheese;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Clams;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Dough;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Pepperoni;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Sauce;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
