package designpatterns.hf.combining.factory.pattern;

import designpatterns.hf.combining.factory.bird.DuckCall;
import designpatterns.hf.combining.factory.bird.MallardDuck;
import designpatterns.hf.combining.factory.bird.Quackable;
import designpatterns.hf.combining.factory.bird.RedheadDuck;
import designpatterns.hf.combining.factory.bird.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}
