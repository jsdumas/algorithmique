package designpatterns.hf.strategy.behaviour;

public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}
