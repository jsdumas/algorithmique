package designpatterns.hf.behavioural.strategy.operation.pattern;

import designpatterns.hf.behavioural.strategy.operation.pattern.operation.OperationStrategy;

public class OperationContext {
	private final OperationStrategy operationStrategy;

	public OperationContext(OperationStrategy operationStrategy) {
		this.operationStrategy = operationStrategy;
	}

	public int executeStrategy(int num1, int num2) {
		return operationStrategy.doOperation(num1, num2);
	}

}
