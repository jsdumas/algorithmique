package algorithms.codingame.bender;

public class EastDirectionState extends NextDirection implements CaseState {

	@Override
	public Direction getDirection() {
		return Direction.EAST;
	}

	@Override
	public Case getNextCase(CaseArea area) {
		return super.getEast(area);
	}

}
