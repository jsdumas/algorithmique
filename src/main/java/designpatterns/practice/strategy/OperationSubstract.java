package pattern.strategy;

import pattern.strategy.contrat.Strategy;

public class OperationSubstract implements Strategy {

	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}

}
