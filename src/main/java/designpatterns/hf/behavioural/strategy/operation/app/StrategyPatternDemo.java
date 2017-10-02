package designpatterns.hf.behavioural.strategy.operation.app;

import designpatterns.hf.behavioural.strategy.operation.pattern.Context;
import designpatterns.hf.behavioural.strategy.operation.pattern.OperationAdd;
import designpatterns.hf.behavioural.strategy.operation.pattern.OperationMultiply;
import designpatterns.hf.behavioural.strategy.operation.pattern.OperationSubstract;

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
