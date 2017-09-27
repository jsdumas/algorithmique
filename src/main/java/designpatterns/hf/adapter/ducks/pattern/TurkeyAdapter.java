package designpatterns.hf.adapter.ducks.pattern;

import designpatterns.hf.adapter.ducks.bird.Duck;
import designpatterns.hf.adapter.ducks.bird.Turkey;

public class TurkeyAdapter implements Duck {
	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}
}
