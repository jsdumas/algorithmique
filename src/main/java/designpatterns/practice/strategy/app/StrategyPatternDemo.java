package designpatterns.practice.strategy.app;

import designpatterns.practice.strategy.pattern.Context;
import designpatterns.practice.strategy.pattern.OperationAdd;
import designpatterns.practice.strategy.pattern.OperationMultiply;
import designpatterns.practice.strategy.pattern.OperationSubstract;

public class StrategyPatternDemo {
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}

}
