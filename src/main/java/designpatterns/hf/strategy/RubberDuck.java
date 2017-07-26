package designpatterns.hf.strategy;

import designpatterns.hf.strategy.behaviour.FlyNoWay;
import designpatterns.hf.strategy.behaviour.Squeak;

public class RubberDuck extends Duck {

	// Constructor assign a behaviour implemented to behaviour interfaced in extended Class Duck
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
