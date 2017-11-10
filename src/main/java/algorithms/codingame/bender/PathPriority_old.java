package algorithms.codingame.bender;

public class PathPriority_old {

	private final CaseArea area;
	private final boolean isInverted;
	private final boolean isXBreaker;
	private final XBreaker xBreaker;

	public PathPriority_old(CaseArea area, boolean isInverted, boolean isXBreaker) {
		this.area = area;
		this.isInverted = isInverted;
		this.isXBreaker = isXBreaker;
		this.xBreaker = new XBreaker(area, isXBreaker);
	}

	private Case getWest() {
		return area.getWest();
	}

	private Case getNorth() {
		return area.getNorth();
	}

	private Case getEast() {
		return area.getEast();
	}

	private Case getSouth() {
		return area.getSouth();
	}

	private boolean isWalkableCase(Case nextCase) {
		if (nextCase != null && nextCase.getCaseType().equals(CaseType.X_OBSTACLE)) {
			if (isXBreaker) {
				return true;
			} else {
				return false;
			}
		}
		return nextCase != null && !nextCase.getCaseType().equals(CaseType.CHARP_OBSTACLE);
	}

	private Case getNextCaseWithPriority() {
		if (isWalkableCase(getSouth())) {
			return xBreaker.getSouth();
		}
		if (isWalkableCase(getEast())) {
			return xBreaker.getEast();
		}
		if (isWalkableCase(getNorth())) {
			return xBreaker.getNorth();
		}
		if (isWalkableCase(getWest())) {
			return xBreaker.getWest();
		}
		area.getCurrentCase().setDirection(Direction.LOOP);
		return area.getCurrentCase();
	}

	private Case getNextCaseWithInvertedPriority() {
		if (isWalkableCase(getWest())) {
			return xBreaker.getWest();
		}
		if (isWalkableCase(getNorth())) {
			return xBreaker.getNorth();
		}
		if (isWalkableCase(getEast())) {
			return xBreaker.getEast();
		}
		if (isWalkableCase(getSouth())) {
			return xBreaker.getSouth();
		}
		area.getCurrentCase().setDirection(Direction.LOOP);
		return area.getCurrentCase();

	}

	public Case getNextCase() {
		if (isInverted) {
			return getNextCaseWithInvertedPriority();
		}
		return getNextCaseWithPriority();
	}

	// public Case getNextCaseFromStart() {
	// if (isWalkableCase(getSouth())) {
	// return getSouth();
	// }
	// return getNextCase();
	// }
}
