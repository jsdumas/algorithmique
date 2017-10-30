package algorithms.codingame.bender;

public class PathToXObstacle extends PriorityPathFinder implements PathFinder {

	private boolean isInverted;
	private boolean isXBreaker;

	public PathToXObstacle(boolean isInverted, boolean isXBreaker) {
		this.isInverted = isInverted;
		this.isXBreaker = isXBreaker;
	}

	@Override
	public Case getNextCase(CaseArea area) {
		return super.getNextCase(area, isInverted, isXBreaker);
	}

}
