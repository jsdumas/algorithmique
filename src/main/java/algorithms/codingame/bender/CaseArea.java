package algorithms.codingame.bender;

public class CaseArea {

	private final Case currentCase;
	private final char[][] map;
	private Case south;
	private Case east;
	private Case north;
	private Case west;

	public CaseArea(Case currentCase, char[][] map) {
		this.currentCase = currentCase;
		this.map = map;
		setCases();
	}

	private void setCases() {
		south = setCase(currentCase.getIdRow()+1,currentCase.getIdCol());
		east = setCase(currentCase.getIdRow(),currentCase.getIdCol()+1);
		north = setCase(currentCase.getIdRow()-1,currentCase.getIdCol());
		west = setCase(currentCase.getIdRow(),currentCase.getIdCol()-1);
	}

	private Case setCase(int idRow, int idCol) {
		return new Case(idRow, idCol, CaseType.getCaseTypeForCharacter(map[idRow][idCol]));
	}

	public Case getSouth() {
		return south;
	}

	public Case getEast() {
		return east;
	}

	public Case getNorth() {
		return north;
	}

	public Case getWest() {
		return west;
	}

}
