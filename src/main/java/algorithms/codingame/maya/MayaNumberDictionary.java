package algorithms.codingame.maya;

import java.util.HashMap;
import java.util.Map;

public class MayaNumberDictionary {

	private static final int MAYA_NUMERIC_SYSTEM = 20;
	private final int width;
	private final int height;
	private final Map<Integer,String> dictionary;
	private final String[] dialect;

	public MayaNumberDictionary(int width, int height, String[] dialect) {
		this.width = width;
		this.height = height;
		this.dialect = dialect;
		this.dictionary = new HashMap<Integer,String>();
		createDictionnary();
	}

	public String getCode(int key) {
		return dictionary.get(key);
	}

	private void createDictionnary() {
		for(int i=0; i<height; i++){
			int firstIndex = 0;
			int lastIndex = width;
			for(int j=0; j<MAYA_NUMERIC_SYSTEM; j++){
				StringBuilder stBuilder = new StringBuilder();
				if(dictionary.get(j)!=null){
					stBuilder.append(dictionary.get(j));
				}
				stBuilder.append(dialect[i].substring(firstIndex, lastIndex));
				dictionary.put(j, stBuilder.toString());
				firstIndex = lastIndex;
				lastIndex = firstIndex + width;
			}
		}
	}

}
