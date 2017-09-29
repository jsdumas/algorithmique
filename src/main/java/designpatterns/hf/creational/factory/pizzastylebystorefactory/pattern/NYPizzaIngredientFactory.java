package designpatterns.hf.creational.factory.pizzastylebystorefactory.pattern;

import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Cheese;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Clams;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Dough;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.FreshClams;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Garlic;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.MarinaraSauce;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Mushroom;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Onion;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Pepperoni;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.RedPepper;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.ReggianoCheese;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Sauce;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.SlicedPepperoni;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.ThinCrustDough;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}
}
