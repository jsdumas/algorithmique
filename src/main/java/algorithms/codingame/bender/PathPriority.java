package algorithms.codingame.bender;

import static algorithms.codingame.bender.CaseType.CHARP_OBSTACLE;
import static algorithms.codingame.bender.CaseType.X_OBSTACLE;

public class PathPriority {
	
	private Case getWest(CaseArea area) {
		return area.getWest();
	}

	private Case getNorth(CaseArea area) {
		return area.getNorth();
	}

	private Case getEast(CaseArea area) {
		return area.getEast();
	}

	private Case getSouth(CaseArea area) {
		return area.getSouth();
	}
	
	private boolean isWalkableCase(Case nextCase, CaseType caseType) {
		return nextCase!=null && !caseType.equals(CHARP_OBSTACLE) && !caseType.equals(X_OBSTACLE);
	}
	
	public Case getNextCaseWithPriority(CaseArea area) {
		if(isWalkableCase(getSouth(area), getSouth(area).getCaseType())){
			return getSouth(area);
		}
		if(isWalkableCase(getEast(area), getEast(area).getCaseType())){
			return getEast(area);
		}
		if(isWalkableCase(getNorth(area), getNorth(area).getCaseType())){
			return getNorth(area);
		}
		if(isWalkableCase(getWest(area), getWest(area).getCaseType())){
			return getWest(area);
		}
		return area.getCurrentCase();
	}


	public Case getNextCaseWithInvertedPriority(CaseArea area) {
		if(isWalkableCase(getWest(area), getWest(area).getCaseType())){
			return getWest(area);
		}
		if(isWalkableCase(getNorth(area), getNorth(area).getCaseType())){
			return getNorth(area);
		}
		if(isWalkableCase(getEast(area), getEast(area).getCaseType())){
			return getEast(area);
		}
		if(isWalkableCase(getSouth(area), getEast(area).getCaseType())){
			return getSouth(area);
		}
		return area.getCurrentCase();

	}
}
