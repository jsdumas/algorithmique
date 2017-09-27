package designpatterns.hf.strategy.duck;

import designpatterns.hf.strategy.behaviour.FlyNoWay;
import designpatterns.hf.strategy.behaviour.Quack;

public class ModelDuck extends Duck {

	// Constructor assign a behaviour implemented to behaviour interfaced in extended Class Duck
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
}
