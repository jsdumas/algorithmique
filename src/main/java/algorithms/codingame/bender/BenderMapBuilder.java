package algorithms.codingame.bender;

public class BenderMapBuilder {
	
	private final BenderMap benderMap;

	public BenderMapBuilder(int row, int col) {
		benderMap= new BenderMap(row, col);
	}

	public BenderMapBuilder withLine(int idRow, String line) {
		char[] lineToCharArray = line.toCharArray();
		for(int i=0; i<lineToCharArray.length; i++) {
			if(lineToCharArray[i]=='@') {
				Case startCase = new Case(idRow, i);
			}
			if(lineToCharArray[i]=='$') {
				Case suicideCase = new Case(idRow, i);
			}
			benderMap.getMap()[idRow][i]=lineToCharArray[i];
		}
		return this;
	}

	public BenderMap build() {
		return benderMap;
	}

}
