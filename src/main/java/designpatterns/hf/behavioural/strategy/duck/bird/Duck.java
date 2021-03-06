package designpatterns.hf.behavioural.strategy.duck.bird;

import designpatterns.hf.behavioural.strategy.duck.behaviour.fly.FlyBehavior;
import designpatterns.hf.behavioural.strategy.duck.behaviour.quack.QuackBehavior;

public abstract class Duck {
	// Behaviour are interfaces
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {
	}

	// Inject an FlyBehaviour implemented
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	// Inject an QuackBehavipour implemented
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

	abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
