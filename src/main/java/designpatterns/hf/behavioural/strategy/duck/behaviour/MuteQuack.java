package designpatterns.hf.behavioural.strategy.duck.behaviour;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
