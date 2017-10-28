package algorithms.codingame.bender;

import static algorithms.codingame.bender.CaseType.CHARP_OBSTACLE;
import static algorithms.codingame.bender.CaseType.X_OBSTACLE;

public abstract class NextDirection {
	
	protected Direction direction;
	
	
	protected Case getWest(CaseArea area) {
		return area.getWest();
	}

	protected Case getNorth(CaseArea area) {
		return area.getNorth();
	}

	protected Case getEast(CaseArea area) {
		return area.getEast();
	}

	protected Case getSouth(CaseArea area) {
		return area.getSouth();
	}
	
	public Case getNextCaseAfterSetNextDirection(CaseArea area) {
		if(getSouth(area)!=null && !getSouth(area).getCaseType().equals(CHARP_OBSTACLE) && !getSouth(area).getCaseType().equals(X_OBSTACLE)){
			direction = Direction.SOUTH;
			return getSouth(area);
		}
		if(getEast(area)!=null && !getEast(area).getCaseType().equals(CHARP_OBSTACLE) && !getEast(area).getCaseType().equals(X_OBSTACLE)){
			direction = Direction.EAST;
			return getEast(area);
		}
		if(getNorth(area)!=null && !getNorth(area).getCaseType().equals(CHARP_OBSTACLE) && !getNorth(area).getCaseType().equals(X_OBSTACLE)){
			direction = Direction.NORTH;
			return getNorth(area);
		}
		if(getWest(area)!=null && !getWest(area).getCaseType().equals(CHARP_OBSTACLE) && !getWest(area).getCaseType().equals(X_OBSTACLE)){
			direction = Direction.WEST;
			return getWest(area);
		}
		direction =  Direction.LOOP;
		return area.getCurrentCase();
	}
	
}
