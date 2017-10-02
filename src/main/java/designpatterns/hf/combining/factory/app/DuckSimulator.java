package designpatterns.hf.combining.factory.app;

import designpatterns.hf.combining.factory.bird.Goose;
import designpatterns.hf.combining.factory.bird.Quackable;
import designpatterns.hf.combining.factory.pattern.AbstractDuckFactory;
import designpatterns.hf.combining.factory.pattern.CountingDuckFactory;
import designpatterns.hf.combining.factory.pattern.GooseAdapter;
import designpatterns.hf.combining.factory.pattern.QuackCounter;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();

		simulator.simulate(duckFactory);
	}

	void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Abstract Factory");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);

		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
