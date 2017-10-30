package algorithms.codingame.bender;

import static algorithms.codingame.bender.Direction.LOOP;

public class MemorisePath {
	
	private final StringBuffer stringBuffer;

	public MemorisePath() {
		this.stringBuffer = new StringBuffer();
	}
	
	public void memorise(Case currentCase, boolean isBenderOnTheRoad) {
		if(currentCase.getDirection().equals(LOOP)) {
			stringBuffer.setLength(0);
			stringBuffer.append(LOOP.toString());
		} else {
			stringBuffer.append(currentCase.getDirection().toString());
			if(isBenderOnTheRoad){
			stringBuffer.append("\n");
			}
		}
	}
	
	public String printDirection() {
		return stringBuffer.toString();
	}
	

}
