package designpatterns.hf.strategy;

import designpatterns.hf.strategy.behaviour.FlyWithWings;
import designpatterns.hf.strategy.behaviour.Quack;

public class MallardDuck extends Duck {
 
	public MallardDuck() {
 
		quackBehavior = new Quack();
                flyBehavior = new FlyWithWings();
 

	}
 
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
