package test.algorithms.codingame.maya;

import algorithms.codingame.maya.MayaNumber;
import algorithms.codingame.maya.MayaNumberConverter;
import algorithms.codingame.maya.MayaNumberDictionary;

public class MayaOperation {

	private final MayaNumber firstNumber;
	private final MayaNumber secondNumber;
	private final MayaNumberConverter mayaNumberConverter;

	public MayaOperation(MayaNumberDictionary mayaDictionnary, MayaNumber firstNumber, MayaNumber secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.mayaNumberConverter = new MayaNumberConverter(mayaDictionnary);
	}

	public Long calcul(String operator) {
		Long result = null;
		Long fNumber = mayaNumberConverter.getMayaNumberTranslated(firstNumber);
		Long sNumber = mayaNumberConverter.getMayaNumberTranslated(secondNumber);
		
		switch(operator){
		case "+" :
			result = fNumber + sNumber;
			break;
		case "-" :
			result = fNumber - sNumber;
			break;
		case "/" :
			result = fNumber / sNumber;
			break;
		case "*" :
			result = fNumber * sNumber;
			break;
		
		}
		return result;
	}
	
	

}
