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
	
	public Case getNextCaseWithPriority(CaseArea area) {
		if(getSouth(area)!=null && !getSouth(area).getCaseType().equals(CHARP_OBSTACLE) && !getSouth(area).getCaseType().equals(X_OBSTACLE)){
			return getSouth(area);
		}
		if(getEast(area)!=null && !getEast(area).getCaseType().equals(CHARP_OBSTACLE) && !getEast(area).getCaseType().equals(X_OBSTACLE)){
			return getEast(area);
		}
		if(getNorth(area)!=null && !getNorth(area).getCaseType().equals(CHARP_OBSTACLE) && !getNorth(area).getCaseType().equals(X_OBSTACLE)){
			return getNorth(area);
		}
		if(getWest(area)!=null && !getWest(area).getCaseType().equals(CHARP_OBSTACLE) && !getWest(area).getCaseType().equals(X_OBSTACLE)){
			return getWest(area);
		}
		return area.getCurrentCase();
	}

	public Case getNextCaseWithInvertedPriority(CaseArea area) {
		if(getWest(area)!=null && !getWest(area).getCaseType().equals(CHARP_OBSTACLE) && !getWest(area).getCaseType().equals(X_OBSTACLE)){
			return getWest(area);
		}
		if(getNorth(area)!=null && !getNorth(area).getCaseType().equals(CHARP_OBSTACLE) && !getNorth(area).getCaseType().equals(X_OBSTACLE)){
			return getNorth(area);
		}
		if(getEast(area)!=null && !getEast(area).getCaseType().equals(CHARP_OBSTACLE) && !getEast(area).getCaseType().equals(X_OBSTACLE)){
			return getEast(area);
		}
		if(getSouth(area)!=null && !getSouth(area).getCaseType().equals(CHARP_OBSTACLE) && !getSouth(area).getCaseType().equals(X_OBSTACLE)){
			return getSouth(area);
		}
		return area.getCurrentCase();

	}
}
