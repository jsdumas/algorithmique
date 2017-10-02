package designpatterns.hf.combining.observer.pattern;

import designpatterns.hf.combining.observer.bird.DuckCall;
import designpatterns.hf.combining.observer.bird.MallardDuck;
import designpatterns.hf.combining.observer.bird.Quackable;
import designpatterns.hf.combining.observer.bird.RedheadDuck;
import designpatterns.hf.combining.observer.bird.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
