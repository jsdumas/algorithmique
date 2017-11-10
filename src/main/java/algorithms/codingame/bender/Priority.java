package algorithms.codingame.bender;

public class Priority implements PathPriority {

	private final CaseArea area;
	private final XBreaker xBreaker;
	private final WalkableCase walkableCase;
	private final boolean isXBreaker;

	public Priority(CaseArea area, boolean isXBreaker) {
		this.area = area;
		this.isXBreaker = isXBreaker;
		this.xBreaker = new XBreaker(area, isXBreaker);
		this.walkableCase = new WalkableCase(isXBreaker);
	}

	private Case getNextCaseWithPriority() {
		Case south = walkableCase.getWalkableCase(area.getSouth());
		Case east = walkableCase.getWalkableCase(area.getEast());
		Case north = walkableCase.getWalkableCase(area.getNorth());
		Case west = walkableCase.getWalkableCase(area.getWest());

		if (south != null) {
			return xBreaker.getSouth();
		}
		if (east != null) {
			return xBreaker.getEast();
		}
		if (north != null) {
			return xBreaker.getNorth();
		}
		if (west != null) {
			return xBreaker.getWest();
		}
		area.getCurrentCase().setDirection(Direction.LOOP);
		return area.getCurrentCase();
	}

	@Override
	public Case getNextCase() {
		if (walkableCase.getWalkableCase(area.getCaseFromInitialDirection()) != null) {
			if (isXBreaker) {

			}
			return area.getCaseFromInitialDirection();
		}
		return getNextCaseWithPriority();
	}

}
