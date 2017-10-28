package algorithms.codingame.bender;

public class Case {

	private final int idRow;
	private final int idCol;
	private final CaseType caseType;
	private Direction direction;
	
	public Case(int idRow, int idCol, CaseType caseType, Direction direction) {
		this.idRow = idRow;
		this.idCol = idCol;
		this.caseType = caseType;
		this.direction = direction;
	}

	public int getIdRow() {
		return idRow;
	}

	public int getIdCol() {
		return idCol;
	}

	public CaseType getCaseType() {
		return caseType;
	}

	public Direction getDirection() {
		return direction;
	}

}
