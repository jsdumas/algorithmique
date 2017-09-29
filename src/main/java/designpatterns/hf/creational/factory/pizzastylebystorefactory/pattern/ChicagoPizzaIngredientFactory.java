package designpatterns.hf.creational.factory.pizzastylebystorefactory.pattern;

import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.BlackOlives;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Cheese;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Clams;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Dough;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Eggplant;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.FrozenClams;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.MozzarellaCheese;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Pepperoni;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.PlumTomatoSauce;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Sauce;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.SlicedPepperoni;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Spinach;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.ThickCrustDough;
import designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), new Spinach(), new Eggplant() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}
}
