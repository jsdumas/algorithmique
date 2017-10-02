package designpatterns.hf.behavioural.strategy.duck.bird;

import designpatterns.hf.behavioural.strategy.duck.behaviour.FlyWithWings;
import designpatterns.hf.behavioural.strategy.duck.behaviour.Quack;

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
