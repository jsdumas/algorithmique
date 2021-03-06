package designpatterns.hf.behavioural.strategy.operation.app;

import designpatterns.hf.behavioural.strategy.operation.behaviour.OperationContext;
import designpatterns.hf.behavioural.strategy.operation.behaviour.operation.OperationAdd;
import designpatterns.hf.behavioural.strategy.operation.behaviour.operation.OperationMultiply;
import designpatterns.hf.behavioural.strategy.operation.behaviour.operation.OperationSubstract;

public class OperationInjection {
	public static void main(String[] args) {
		OperationContext operationContext = new OperationContext(new OperationAdd());
		System.out.println("10 + 5 = " + operationContext.executeStrategy(10, 5));

		operationContext = new OperationContext(new OperationSubstract());
		System.out.println("10 - 5 = " + operationContext.executeStrategy(10, 5));

		operationContext = new OperationContext(new OperationMultiply());
		System.out.println("10 * 5 = " + operationContext.executeStrategy(10, 5));
	}

}
