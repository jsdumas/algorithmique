package designpatterns.hf.strategy.behaviour;


public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
