package algorithms.codingame.bender;

public class PathFromXObstacle implements PathFinder {

	private final PathPriority pathPriority;

	public PathFromXObstacle(CaseArea area, boolean isInverted, boolean isXBreaker) {
		this.pathPriority = new PathPriority(area, isInverted, isXBreaker);
	}

	@Override
	public Case getNextCase() {
		return pathPriority.getNextCase();
	}

}
