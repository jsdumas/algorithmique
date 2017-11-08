package algorithms.codingame.bender;

import static algorithms.codingame.bender.CaseType.SUICIDE;
import static algorithms.codingame.bender.Direction.LOOP;

public class MemorisePath {

	private final StringBuffer stringBuffer;

	public MemorisePath() {
		this.stringBuffer = new StringBuffer();
	}

	public void memorise(Case nextCase) {
		if (nextCase.getCaseType().equals(CaseType.CHARP_OBSTACLE) || nextCase.getCaseType().equals(CaseType.X_OBSTACLE)) {
			stringBuffer.setLength(0);
			stringBuffer.append(LOOP.toString());
		} else {
			stringBuffer.append(nextCase.getDirection().toString());
			if (!nextCase.getCaseType().equals(SUICIDE)) {
				stringBuffer.append("\n");
			}
		}
	}

	public String printDirection() {
		return stringBuffer.toString();
	}

}
