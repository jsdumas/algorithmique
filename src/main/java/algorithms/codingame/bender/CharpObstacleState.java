package algorithms.codingame.bender;

public class CharpObstacleState implements BenderState {

	@Override
	public String getDirection() {
		if(true)
			return Direction.SOUTH.getDirection();
		if(true)
			return Direction.EAST.getDirection();
		if(true)
			return Direction.NORTH.getDirection();
		if(true)
			return Direction.WEST.getDirection();
		return Direction.LOOP.getDirection();
	}

}
