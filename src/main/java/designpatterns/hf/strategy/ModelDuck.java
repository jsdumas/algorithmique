package designpatterns.hf.strategy;

import designpatterns.hf.strategy.behaviour.FlyNoWay;
import designpatterns.hf.strategy.behaviour.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
