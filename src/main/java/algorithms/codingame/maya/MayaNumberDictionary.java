package algorithms.codingame.maya;

import java.util.HashMap;
import java.util.Map;

public class MayaNumberDictionary {

	private static final int MAYA_NUMERIC_SYSTEM = 20;
	private final int width;
	private final int height;
	private final Map<Integer,String> dictionary;
	private int key;

	public MayaNumberDictionary(int width, int height) {
		this.width = width;
		this.height = height;
		this.dictionary = new HashMap<Integer,String>();
		this.key=0;
	}

	public String getCode(int key) {
		return dictionary.get(key);
	}

	public void setCode(String pattern) {
		int chainNumber = width*height;
		int patternPart = MAYA_NUMERIC_SYSTEM / width;
		int firstIndex = 0;
		int lastIndex = firstIndex + chainNumber;
		for(int i=0; i<patternPart; i++){
			key++;
			String code = pattern.substring(firstIndex, lastIndex);
			pattern = pattern.substring(lastIndex);
			dictionary.put(key, code);
		}
	}

}
