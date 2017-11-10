package algorithms.codingame.bender;

public class Bender {

	private final MemorisePath memorisePath;
	private final Walk walk;
	private Case currentCase;
	private Direction direction;

	public Bender(BenderMap benderMap) {
		this.memorisePath = new MemorisePath();
		this.walk = new Walk(benderMap);
		this.currentCase = benderMap.getStartCase();
		this.direction = Direction.SOUTH;
	}

	private boolean isBenderOnTheRoad() {
		return currentCase != null && !currentCase.getCaseType().equals(CaseType.SUICIDE) && !memorisePath.printDirection().equals(
				Direction.LOOP.toString());
	}

	public void walkToSuicideCase() {
		while (isBenderOnTheRoad()) {
			Case nextCase = walk.toNextCase(currentCase, direction);
			memorisePath.memorise(nextCase);
			currentCase = nextCase;
			direction = nextCase.getDirection();
		}
	}

	public MemorisePath getMemorisePath() {
		return memorisePath;
	}

}
