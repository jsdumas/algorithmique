package designpatterns.hf.decorator.starbuzz.pattern;

import designpatterns.hf.decorator.starbuzz.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}