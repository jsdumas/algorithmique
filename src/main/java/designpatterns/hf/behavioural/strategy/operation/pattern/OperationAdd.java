package designpatterns.hf.behavioural.strategy.operation.pattern;


public class OperationAdd implements Strategy {

	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}

}
