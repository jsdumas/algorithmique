package algorithms.codingame.bender;

public class StartState implements CaseState {


	@Override
	public Direction getDirection() {
		return Direction.SOUTH;
	}

	@Override
	public Case getNextCase(Case currentCase) {
		return new Case(currentCase.getIdRow(),currentCase.getIdCol()+1);
	}

}
