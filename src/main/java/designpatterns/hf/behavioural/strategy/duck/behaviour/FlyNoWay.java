package designpatterns.hf.behavioural.strategy.duck.behaviour;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
