package designpatterns.hf.behavioural.strategy.duck.behaviour.quack;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
