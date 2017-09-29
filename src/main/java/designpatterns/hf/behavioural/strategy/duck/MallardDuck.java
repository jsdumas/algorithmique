package designpatterns.hf.behavioural.strategy.duck;

import designpatterns.hf.behavioural.strategy.behaviour.FlyWithWings;
import designpatterns.hf.behavioural.strategy.behaviour.Quack;

public class MallardDuck extends Duck {

	// Constructor assign a behaviour implemented to behaviour interfaced in extended Class Duck
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
