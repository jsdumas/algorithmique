package algorithms.codingame.bender;

public class SouthDirectionState extends NextDirection implements CaseState {
	

	@Override
	public Direction getDirection() {
		return Direction.SOUTH;
	}

	@Override
	public Case getNextCase(CaseArea area) {
		return super.getSouth(area);
	}

}
