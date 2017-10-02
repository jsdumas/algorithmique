package designpatterns.hf.combining.factory.pattern;

import designpatterns.hf.combining.factory.bird.DuckCall;
import designpatterns.hf.combining.factory.bird.MallardDuck;
import designpatterns.hf.combining.factory.bird.Quackable;
import designpatterns.hf.combining.factory.bird.RedheadDuck;
import designpatterns.hf.combining.factory.bird.RubberDuck;

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
