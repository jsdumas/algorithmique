package algorithms.codingame.bender;

public class SouthDirectionState implements CaseState {
	
	private Direction direction;

	@Override
	public Direction getDirection() {
		return direction;
	}

	@Override
	public Case getNextCase(CaseArea area) {
		direction = Direction.SOUTH;
		return getSouth(area);
	}

	private Case getSouth(CaseArea area) {
		return area.getSouth();
	}
}
