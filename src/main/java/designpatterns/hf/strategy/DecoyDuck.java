package designpatterns.hf.strategy;

import designpatterns.hf.strategy.behaviour.FlyNoWay;
import designpatterns.hf.strategy.behaviour.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
