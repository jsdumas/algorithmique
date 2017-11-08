package algorithms.codingame.bender;

public class PathFromInversor implements PathFinder {

	private final PathPriority pathPriority;

	public PathFromInversor(CaseArea area, boolean isInverted, boolean isXBreaker) {
		this.pathPriority = new PathPriority(area, isInverted, isXBreaker);
	}

	@Override
	public Case getNextCase() {
		return pathPriority.getNextCase();
	}

}
