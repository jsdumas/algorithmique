package designpatterns.hf.behavioural.templatemethod.simplebarista.app;

import designpatterns.hf.behavioural.templatemethod.simplebarista.drink.Coffee;
import designpatterns.hf.behavioural.templatemethod.simplebarista.drink.Tea;

public class Barista {
 
	public static void main(String[] args) {
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
		System.out.println("Making tea...");
		tea.prepareRecipe();
		System.out.println("Making coffee...");
		coffee.prepareRecipe();
	}
}
