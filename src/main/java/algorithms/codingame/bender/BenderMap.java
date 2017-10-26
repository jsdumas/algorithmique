package algorithms.codingame.bender;

import static algorithms.codingame.bender.CaseType.CHARP_OBSTACLE;
import static algorithms.codingame.bender.CaseType.X_OBSTACLE;
import static algorithms.codingame.bender.Direction.LOOP;

public class BenderMap {
	
	private static final StateFactory STATE_FACTORY = new StateFactory();
	private static final char AT = '@';
	
	private final char[][] map;
	private final Case startCase;
	private final Case suicideCase;

	public BenderMap(int row, int col) {
		this.map = new char[row][col];
	}

	public char[][] getMap() {
		return map;
	}

	public String start() {
		char next = map[startX][startY+1];
		if(next==CHARP_OBSTACLE.getChar() || next==X_OBSTACLE.getChar()) {
			return LOOP.getDirection();
		}
		BenderState start = STATE_FACTORY.getState(AT);
		return start.getDirection();
	}

	public void setStartCase(int idRow, int idCol) {
		startCase=new Case(idRow, idCol);
	}
	
	public void setSuicideCase(int idRow, int idCol) {
		suicideCase=new Case(idRow, idCol);
	}

}
