package algorithms.codingame.bender;

public class BenderBuilder {
	
	private final char [][] map;
	private Case startCase;
	private Case suicideCase;

	public BenderBuilder(int row, int col) {
		map = new char [row][col];
	}

	public BenderBuilder withLine(int idRow, String line) {
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

	public Bender build() {
		Bender bender = new Bender(new BenderMap(map, startCase, suicideCase));
		bender.walkToSuicideCase();
		return bender;
	}

}
