package designpatterns.hf.behavioural.strategy.duck;

import designpatterns.hf.behavioural.strategy.behaviour.FlyWithWings;
import designpatterns.hf.behavioural.strategy.behaviour.Quack;

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
