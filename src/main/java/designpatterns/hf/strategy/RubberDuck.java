package designpatterns.hf.strategy;

import designpatterns.hf.strategy.behaviour.FlyNoWay;
import designpatterns.hf.strategy.behaviour.Squeak;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
