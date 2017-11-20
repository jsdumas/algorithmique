package algorithms.codingame.maya;

import static algorithms.codingame.maya.MayaNumberDictionary.MAYA_NUMERIC_SYSTEM;

import java.util.LinkedList;
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
			String line = mayaNumberSplited.poll();
			int value = 0;
			for (Map.Entry<Integer, String> entrySet : mayaDictionnary.getDictionary().entrySet()) {
				if (line.equals(entrySet.getValue())) {
					value = (int) (entrySet.getKey() * Math.pow(MAYA_NUMERIC_SYSTEM, power));
					break;
				}
			}
			result += value;
			power--;
		}

		return result;
	}

	private Queue<String> splitMayaNumber(Queue<String> lines) {
		Queue<String> mayaNumberSplited = new LinkedList<String>();
		while (!lines.isEmpty()) {
			StringBuilder stringBuilder = new StringBuilder();
			for (int i = 0; i < mayaDictionnary.getHeight(); i++) {
				stringBuilder.append(lines.poll());
			}
			mayaNumberSplited.add(stringBuilder.toString());
		}
		return mayaNumberSplited;
	}

}
