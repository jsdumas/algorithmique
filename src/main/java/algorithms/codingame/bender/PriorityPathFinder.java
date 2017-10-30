package algorithms.codingame.bender;

public abstract class PriorityPathFinder {
	
	private PathPriority pathPriority = new PathPriority();
	
	protected Case getNextCase(CaseArea area, boolean isInverted, boolean isXBreaker){
		if(isInverted){
			return pathPriority.getNextCaseWithInvertedPriority(area, isXBreaker);
		}
		return pathPriority.getNextCaseWithPriority(area, isXBreaker);
	}
}
