package designpatterns.hf.behavioural.strategy.duck.bird;

import designpatterns.hf.behavioural.strategy.duck.behaviour.FlyNoWay;
import designpatterns.hf.behavioural.strategy.duck.behaviour.Squeak;

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
