package designpatterns.hf.factory.pizzaaf.pattern;

import designpatterns.hf.factory.pizzaaf.ingredient.Cheese;
import designpatterns.hf.factory.pizzaaf.ingredient.Clams;
import designpatterns.hf.factory.pizzaaf.ingredient.Dough;
import designpatterns.hf.factory.pizzaaf.ingredient.FreshClams;
import designpatterns.hf.factory.pizzaaf.ingredient.Garlic;
import designpatterns.hf.factory.pizzaaf.ingredient.MarinaraSauce;
import designpatterns.hf.factory.pizzaaf.ingredient.Mushroom;
import designpatterns.hf.factory.pizzaaf.ingredient.Onion;
import designpatterns.hf.factory.pizzaaf.ingredient.Pepperoni;
import designpatterns.hf.factory.pizzaaf.ingredient.RedPepper;
import designpatterns.hf.factory.pizzaaf.ingredient.ReggianoCheese;
import designpatterns.hf.factory.pizzaaf.ingredient.Sauce;
import designpatterns.hf.factory.pizzaaf.ingredient.SlicedPepperoni;
import designpatterns.hf.factory.pizzaaf.ingredient.ThinCrustDough;
import designpatterns.hf.factory.pizzaaf.ingredient.Veggies;

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
