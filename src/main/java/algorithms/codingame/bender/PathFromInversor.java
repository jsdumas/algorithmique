package algorithms.codingame.bender;

public class PathFromInversor extends PriorityPathFinder implements PathFinder {


	private boolean isInverted;
	private boolean isXBreaker;

	public PathFromInversor(boolean isInverted, boolean isXBreaker) {
		this.isInverted = isInverted;
		this.isXBreaker = isXBreaker;
	}

	@Override
	public Case getNextCase(CaseArea area) {
		return super.getNextCase(area, isInverted, isXBreaker);
	}

}
