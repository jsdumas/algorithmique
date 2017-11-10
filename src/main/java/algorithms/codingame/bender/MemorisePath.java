package algorithms.codingame.bender;

public class MemorisePath {

	private final StringBuffer stringBuffer;

	public MemorisePath() {
		this.stringBuffer = new StringBuffer();
	}

	public void memorise(Case nextCase) {
		if (nextCase.getCaseType().equals(CaseType.CHARP_OBSTACLE) || nextCase.getCaseType().equals(CaseType.X_OBSTACLE)) {
			stringBuffer.setLength(0);
			stringBuffer.append(Direction.LOOP.toString());
		} else {
			stringBuffer.append(nextCase.getDirection().toString());
			if (!nextCase.getCaseType().equals(CaseType.SUICIDE) && !nextCase.getDirection().equals(Direction.LOOP)) {
				stringBuffer.append("\n");
			}
		}
	}

	public String printDirection() {
		return stringBuffer.toString();
	}

}
