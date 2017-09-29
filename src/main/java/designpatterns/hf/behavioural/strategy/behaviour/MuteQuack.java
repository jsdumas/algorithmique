package designpatterns.hf.behavioural.strategy.behaviour;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
