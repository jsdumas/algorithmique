package test.designpatterns.hf.combining.factory.pattern;

import java.util.List;

import designpatterns.hf.combining.factory.bird.Quackable;
import designpatterns.hf.combining.factory.pattern.QuackCounter;

public class QuackSimulator {

	private final List<Quackable> quackableTeam;

	public QuackSimulator(List<Quackable> quackableTeam) {
		this.quackableTeam = quackableTeam;
	}

	public int getNumberOfQuackWhenEachDuckQuackOneTime() {
		eachDuckQuackOneTime();
		return QuackCounter.getQuacks();
	}

	private void eachDuckQuackOneTime() {
		for (Quackable quackable : quackableTeam) {
			simulate(quackable);
		}
	}

	private void simulate(Quackable duck) {
		duck.quack();
	}

}
