package designpatterns.hf.factory.pizzaaf.pattern;

import designpatterns.hf.factory.pizzaaf.ingredient.BlackOlives;
import designpatterns.hf.factory.pizzaaf.ingredient.Cheese;
import designpatterns.hf.factory.pizzaaf.ingredient.Clams;
import designpatterns.hf.factory.pizzaaf.ingredient.Dough;
import designpatterns.hf.factory.pizzaaf.ingredient.Eggplant;
import designpatterns.hf.factory.pizzaaf.ingredient.FrozenClams;
import designpatterns.hf.factory.pizzaaf.ingredient.MozzarellaCheese;
import designpatterns.hf.factory.pizzaaf.ingredient.Pepperoni;
import designpatterns.hf.factory.pizzaaf.ingredient.PlumTomatoSauce;
import designpatterns.hf.factory.pizzaaf.ingredient.Sauce;
import designpatterns.hf.factory.pizzaaf.ingredient.SlicedPepperoni;
import designpatterns.hf.factory.pizzaaf.ingredient.Spinach;
import designpatterns.hf.factory.pizzaaf.ingredient.ThickCrustDough;
import designpatterns.hf.factory.pizzaaf.ingredient.Veggies;

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
