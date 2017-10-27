package algorithms.codingame.bender;

import static algorithms.codingame.bender.CaseType.CHARP_OBSTACLE;
import static algorithms.codingame.bender.CaseType.X_OBSTACLE;

public class StartState implements CaseState {
	
	private Direction direction;


	@Override
	public Direction getDirection() {
		return direction;
	}

	@Override
	public Case getNextCase(CaseArea area) {
		if(!getSouth(area).getCaseType().equals(CHARP_OBSTACLE) && !getSouth(area).getCaseType().equals(X_OBSTACLE)){
			direction = Direction.SOUTH;
			return getSouth(area);
		}
		if(!getEast(area).getCaseType().equals(CHARP_OBSTACLE) && !getEast(area).getCaseType().equals(X_OBSTACLE)){
			direction = Direction.EAST;
			return getEast(area);
		}
		if(!getNorth(area).getCaseType().equals(CHARP_OBSTACLE) && !getNorth(area).getCaseType().equals(X_OBSTACLE)){
			direction = Direction.NORTH;
			return getNorth(area);
		}
		if(!getWest(area).getCaseType().equals(CHARP_OBSTACLE) && !getWest(area).getCaseType().equals(X_OBSTACLE)){
			direction = Direction.WEST;
			return getWest(area);
		}
		direction =  Direction.LOOP;
		return null;
	}

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
	

}
