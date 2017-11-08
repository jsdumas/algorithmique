package algorithms.codingame.bender;

public class PathFromXObstacle extends PriorityPathFinder implements PathFinder {

	private final boolean isInverted;
	private final boolean isXBreaker;
	private final CaseArea area;

	public PathFromXObstacle(CaseArea area, boolean isInverted, boolean isXBreaker) {
		this.area = area;
		this.isInverted = isInverted;
		this.isXBreaker = isXBreaker;
	}

	@Override
	public Case getNextCase() {
		return super.getNextCase(area, isInverted, isXBreaker);
	}

}
