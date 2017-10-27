package algorithms.codingame.bender;

public class Case {

	private int idRow;
	private int idCol;
	private CaseType caseType;

	public Case(int idRow, int idCol, CaseType caseType) {
		this.idRow = idRow;
		this.idCol = idCol;
		this.caseType = caseType;
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

}
