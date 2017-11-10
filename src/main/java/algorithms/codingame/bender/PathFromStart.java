package algorithms.codingame.bender;

public class PathFromStart implements PathFinder {

	// private final PathPriority_old pathPriority_old;
	private final NextCase nextCase;

	public PathFromStart(CaseArea area, boolean isInverted, boolean isXBreaker) {
		// this.pathPriority_old = new PathPriority_old(area, isInverted, isXBreaker);
		this.nextCase = new NextCase(area, isInverted, isXBreaker);
	}

	@Override
	public Case getNextCase() {
		return nextCase.getCase();
	}

}
