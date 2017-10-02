package designpatterns.hf.behavioural.strategy.duck.behaviour;

public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}
