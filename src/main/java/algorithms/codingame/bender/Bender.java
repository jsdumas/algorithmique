package algorithms.codingame.bender;

import static algorithms.codingame.bender.CaseType.SUICIDE;
import static algorithms.codingame.bender.Direction.LOOP;

public class Bender {

	private final MemorisePath memorisePath;
	private final Walk walk;
	private Case currentCase;

	public Bender(BenderMap benderMap) {
		this.memorisePath = new MemorisePath();
		this.walk = new Walk(benderMap);
		this.currentCase = benderMap.getStartCase();
	}

	private boolean isBenderOnTheRoad() {
		return currentCase != null && !currentCase.getCaseType().equals(SUICIDE) && !memorisePath.printDirection().equals(LOOP.toString());
	}

public void walkToSuicideCase() {
		while (isBenderOnTheRoad()) {
			Case nextCase = walk.toNextCase(currentCase);
			memorisePath.memorise(nextCase);
			currentCase = nextCase;
		}
	}

	public MemorisePath getMemorisePath() {
		return memorisePath;
	}

}
