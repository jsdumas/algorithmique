package designpatterns.hf.strategy.duck;

import designpatterns.hf.strategy.behaviour.FlyWithWings;
import designpatterns.hf.strategy.behaviour.Quack;

public class RedHeadDuck extends Duck {

	// Constructor assign a behaviour implemented to behaviour interfaced in extended Class Duck
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
