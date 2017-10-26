package algorithms.codingame.bender;

public class CharpObstacleState implements CaseState {

	@Override
	public Direction getDirection() {
		if(true)
			return Direction.SOUTH;
		if(true)
			return Direction.EAST;
		if(true)
			return Direction.NORTH;
		if(true)
			return Direction.WEST;
		return Direction.LOOP;
	}

	@Override
	public Case getNextCase(Case currentCase) {
		// TODO Auto-generated method stub
		return null;
	}

}
