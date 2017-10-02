package designpatterns.hf.behavioural.strategy.duck.behaviour;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
