package designpatterns.hf.strategy;

import designpatterns.hf.strategy.behaviour.FlyWithWings;
import designpatterns.hf.strategy.behaviour.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
