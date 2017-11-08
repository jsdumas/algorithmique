package algorithms.codingame.bender;

public class Case {

	private final int idRow;
	private final int idCol;
	private CaseType caseType;
	private Direction direction;
	private Case comeFrom;
	
	
	public Case(int idRow, int idCol, CaseType caseType, Direction direction, Case comeFrom) {
		this.idRow = idRow;
		this.idCol = idCol;
		this.caseType = caseType;
		this.direction = direction;
		this.comeFrom = comeFrom;
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
	
	public void setEmptyCaseType() {
		this.caseType=CaseType.EMPTY;
	}

	public Direction getDirection() {
		return direction;
	}
	
	public Case getComeFrom() {
		return comeFrom;
	}

}
