package algorithms.codingame.maya;

import java.util.Map;
import java.util.Queue;

public class MayaNumberConverter {

	private final MayaNumberDictionary mayaDictionnary;

	public MayaNumberConverter(MayaNumberDictionary mayaDictionnary) {
		this.mayaDictionnary = mayaDictionnary;
	}

	public Long getMayaNumberTranslated(MayaNumber mayaNumber) {
		Queue<String> mayaNumberSplited = splitMayaNumber(mayaNumber.getLines());
		int power = mayaNumberSplited.size() - 1;
		Long result = 0L;
		while (!mayaNumberSplited.isEmpty()) {
			String line = mayaNumberSplited.peek();
			int value = 0;
			for (Map.Entry<Integer, String> entrySet : mayaDictionnary.getDictionary().entrySet()) {
				if (line.equals(entrySet.getValue())) {
					value = entrySet.getKey();
					break;
				}
			}
			result += value;
			power--;
		}

		return result;
	}

}
