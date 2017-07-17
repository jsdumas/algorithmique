package designpatterns.practice.strategy;

import designpatterns.practice.strategy.contrat.Strategy;

public class OperationMultiply implements Strategy {

	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}

}
