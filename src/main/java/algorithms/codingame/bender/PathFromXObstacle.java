package algorithms.codingame.bender;

public class PathFromXObstacle extends PriorityPathFinder implements PathFinder {

	private boolean isInverted;
	private boolean isXBreaker;

	public PathFromXObstacle(boolean isInverted, boolean isXBreaker) {
		this.isInverted = isInverted;
		this.isXBreaker = isXBreaker;
	}

	@Override
	public Case getNextCase(CaseArea area) {
		return super.getNextCase(area, isInverted, isXBreaker);
	}

}
