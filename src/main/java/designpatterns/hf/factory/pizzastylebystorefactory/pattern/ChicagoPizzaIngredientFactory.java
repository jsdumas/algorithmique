package designpatterns.hf.factory.pizzastylebystorefactory.pattern;

import designpatterns.hf.factory.pizzastylebystorefactory.ingredient.BlackOlives;
import designpatterns.hf.factory.pizzastylebystorefactory.ingredient.Cheese;
import designpatterns.hf.factory.pizzastylebystorefactory.ingredient.Clams;
import designpatterns.hf.factory.pizzastylebystorefactory.ingredient.Dough;
import designpatterns.hf.factory.pizzastylebystorefactory.ingredient.Eggplant;
import designpatterns.hf.factory.pizzastylebystorefactory.ingredient.FrozenClams;
import designpatterns.hf.factory.pizzastylebystorefactory.ingredient.MozzarellaCheese;
import designpatterns.hf.factory.pizzastylebystorefactory.ingredient.Pepperoni;
import designpatterns.hf.factory.pizzastylebystorefactory.ingredient.PlumTomatoSauce;
import designpatterns.hf.factory.pizzastylebystorefactory.ingredient.Sauce;
import designpatterns.hf.factory.pizzastylebystorefactory.ingredient.SlicedPepperoni;
import designpatterns.hf.factory.pizzastylebystorefactory.ingredient.Spinach;
import designpatterns.hf.factory.pizzastylebystorefactory.ingredient.ThickCrustDough;
import designpatterns.hf.factory.pizzastylebystorefactory.ingredient.Veggies;

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
