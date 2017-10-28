package algorithms.codingame.bender;

public class StartState extends NextDirection implements CaseState {

	@Override
	public Direction getDirection() {
		return super.direction;
	}

	@Override
	public Case getNextCase(CaseArea area) {
		return super.getNextCaseAfterSetNextDirection(area);
	}

}
