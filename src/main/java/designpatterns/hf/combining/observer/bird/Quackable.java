package designpatterns.hf.combining.observer.bird;

import designpatterns.hf.combining.observer.pattern.QuackObservable;

public interface Quackable extends QuackObservable {
	public void quack();
}
