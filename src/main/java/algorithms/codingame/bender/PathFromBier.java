package algorithms.codingame.bender;

public class PathFromBier extends PriorityPathFinder implements PathFinder {

	private final boolean isInverted;
	private final boolean isXBreaker;

	public PathFromBier(CaseArea area, boolean isInverted, boolean isXBreaker) {
		this.isInverted = isInverted;
		this.isXBreaker = isXBreaker;
	}

	@Override
	public Case getNextCase(CaseArea area) {
		return super.getNextCase(area, isInverted, isXBreaker);
	}

}
