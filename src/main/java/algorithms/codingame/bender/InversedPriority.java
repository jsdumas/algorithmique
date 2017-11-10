package algorithms.codingame.bender;

public class InversedPriority implements PathPriority {

	private final CaseArea area;
	private final XBreaker xBreaker;
	private final WalkableCase walkableCase;

	public InversedPriority(CaseArea area, boolean isXBreaker) {
		this.area = area;
		this.xBreaker = new XBreaker(area, isXBreaker);
		this.walkableCase = new WalkableCase(isXBreaker);
	}

	private Case getNextCaseWithInversedPriority() {
		Case caseFromInitialDirection = walkableCase.getWalkableCase(area.getCaseFromInitialDirection());

		Case south = walkableCase.getWalkableCase(area.getSouth());
		Case east = walkableCase.getWalkableCase(area.getEast());
		Case north = walkableCase.getWalkableCase(area.getNorth());
		Case west = walkableCase.getWalkableCase(area.getWest());

		if (caseFromInitialDirection != null) {
			return xBreaker.getCaseFromInitialDirection(caseFromInitialDirection);
		}

		if (west != null) {
			return xBreaker.getWest();
		}

		if (north != null) {
			return xBreaker.getNorth();
		}

		if (east != null) {
			return xBreaker.getEast();
		}

		if (south != null) {
			return xBreaker.getSouth();
		}

		area.getCurrentCase().setDirection(Direction.LOOP);
		return area.getCurrentCase();
	}

	@Override
	public Case getNextCase() {
		return getNextCaseWithInversedPriority();
	}

}
