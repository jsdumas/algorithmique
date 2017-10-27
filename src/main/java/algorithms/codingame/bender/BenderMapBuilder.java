package algorithms.codingame.bender;

public class BenderMapBuilder {
	
	private final char [][] map;
	private Case startCase;
	private Case suicideCase;

	public BenderMapBuilder(int row, int col) {
		map = new char [row][col];
	}

	public BenderMapBuilder withLine(int idRow, String line) {
		char[] lineToCharArray = line.toCharArray();
		for(int i=0; i<lineToCharArray.length; i++) {
			if(lineToCharArray[i]=='@') {
				startCase = new Case(idRow, i, CaseType.getCaseTypeForCharacter('@'));
			}
			if(lineToCharArray[i]=='$') {
				suicideCase = new Case(idRow, i, CaseType.getCaseTypeForCharacter('$'));
			}
			map[idRow][i]=lineToCharArray[i];
		}
		return this;
	}

	public BenderMap build() {
		return new BenderMap(map, startCase, suicideCase);
	}

}
