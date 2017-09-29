package designpatterns.hf.behavioural.strategy.behaviour;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
