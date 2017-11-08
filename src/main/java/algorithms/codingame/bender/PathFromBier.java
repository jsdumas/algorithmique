package algorithms.codingame.bender;

public class PathFromBier extends PriorityPathFinder implements PathFinder {

	private final boolean isInverted;
	private final boolean isXBreaker;
	private final CaseArea area;

	public PathFromBier(CaseArea area, boolean isInverted, boolean isXBreaker) {
		this.area = area;
		this.isInverted = isInverted;
		this.isXBreaker = isXBreaker;
	}

	@Override
	public Case getNextCase() {
		return super.getNextCase(area, isInverted, isXBreaker);
	}

}
