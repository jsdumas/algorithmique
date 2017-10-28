package algorithms.codingame.bender;

public class NorthDirectionState extends NextDirection implements CaseState {

	@Override
	public Direction getDirection() {
		return Direction.NORTH;
	}

	@Override
	public Case getNextCase(CaseArea area) {
		return super.getNorth(area);
	}

}
