package designpatterns.hf.decorator.starbuzz.app;

import designpatterns.hf.decorator.starbuzz.beverage.Beverage;
import designpatterns.hf.decorator.starbuzz.beverage.DarkRoast;
import designpatterns.hf.decorator.starbuzz.beverage.Espresso;
import designpatterns.hf.decorator.starbuzz.beverage.HouseBlend;
import designpatterns.hf.decorator.starbuzz.pattern.Mocha;
import designpatterns.hf.decorator.starbuzz.pattern.Soy;
import designpatterns.hf.decorator.starbuzz.pattern.Whip;

public class StarbuzzCoffee {
 
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost());
 
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());
 
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + beverage3.cost());
	}
}
