package designpatterns.hf.combining.adapter.app;

import designpatterns.hf.combining.adapter.bird.DuckCall;
import designpatterns.hf.combining.adapter.bird.Goose;
import designpatterns.hf.combining.adapter.bird.MallardDuck;
import designpatterns.hf.combining.adapter.bird.Quackable;
import designpatterns.hf.combining.adapter.bird.RedheadDuck;
import designpatterns.hf.combining.adapter.bird.RubberDuck;
import designpatterns.hf.combining.adapter.pattern.GooseAdapter;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}

	void simulate() {
		Quackable mallardDuck = new MallardDuck();
		Quackable redheadDuck = new RedheadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();

		// Adapter pattern
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Goose Adapter");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
