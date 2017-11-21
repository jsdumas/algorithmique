package test.algorithms.codingame.maya;

import algorithms.codingame.maya.MayaNumber;
import algorithms.codingame.maya.MayaNumberConverter;
import algorithms.codingame.maya.MayaNumberDictionary;

public class MayaOperation {

	private final Long fNumber;
	private final Long sNumber;
	private final MayaNumberConverter mayaNumberConverter;

	public MayaOperation(MayaNumberDictionary mayaDictionnary, MayaNumber firstNumber, MayaNumber secondNumber) {
		this.mayaNumberConverter = new MayaNumberConverter(mayaDictionnary);
		this.fNumber = mayaNumberConverter.getMayaNumberTranslated(firstNumber);
		;
		this.sNumber = mayaNumberConverter.getMayaNumberTranslated(secondNumber);
	}

	public Long calcul(String operator) {
		Long result = null;
		switch (operator) {
			case "+":
				result = fNumber + sNumber;
				break;
			case "-":
				result = fNumber - sNumber;
				break;
			case "/":
				result = fNumber / sNumber;
				break;
			case "*":
				result = fNumber * sNumber;
				break;

		}
		return result;
	}

}
