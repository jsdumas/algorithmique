package algorithms.codingame.bender;

public class BenderMap {
	
	private final char[][] map;
	private final Case startCase;
	private final Case suicideCase;


	public BenderMap(char[][] map, Case startCase, Case suicideCase) {
		this.map=map;
		this.startCase=startCase;
		this.suicideCase=suicideCase;
	}

	public char[][] getMap() {
		return map;
	}

	public Case getStartCase() {
		return startCase;
	}
	
	public Case getSuicideCase() {
		return suicideCase;
	}

}
