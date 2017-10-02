package designpatterns.hf.behavioural.strategy.duck.bird;

import designpatterns.hf.behavioural.strategy.duck.behaviour.FlyWithWings;
import designpatterns.hf.behavioural.strategy.duck.behaviour.Quack;

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
