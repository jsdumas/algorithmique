package algorithms.codingame.bender;

public class WestDirectionState extends NextDirection implements CaseState {

	@Override
	public Direction getDirection() {
		return Direction.WEST;
	}

	@Override
	public Case getNextCase(CaseArea area) {
		return super.getWest(area);
	}

}
