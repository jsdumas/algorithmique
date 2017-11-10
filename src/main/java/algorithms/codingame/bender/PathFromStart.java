package algorithms.codingame.bender;

public class PathFromStart implements PathFinder {

	private final PathPriority pathPriority;

	public PathFromStart(CaseArea area, boolean isInverted, boolean isXBreaker) {
		this.pathPriority = new PathPriority(area, isInverted, isXBreaker);
	}

	@Override
	public Case getNextCase() {
		return pathPriority.getNextCaseFromStart();
	}

}
