package algorithms.codingame.bender;

import static algorithms.codingame.bender.Direction.EAST;
import static algorithms.codingame.bender.Direction.NORTH;
import static algorithms.codingame.bender.Direction.SOUTH;
import static algorithms.codingame.bender.Direction.WEST;

public class CaseArea {

	private final Case currentCase;
	private final char[][] map;
	private Case south;
	private Case east;
	private Case north;
	private Case west;
	private Teleporter teleporter;
	private BenderMap benderMap;

	public CaseArea(Case currentCase, BenderMap benderMap) {
		this.currentCase = currentCase;
		this.benderMap = benderMap;
		this.map = benderMap.getMap();
		this.teleporter = benderMap.getTeletransporter();
		setCases();
	}

	private void setCases() {
		south = setCase(currentCase.getIdRow()+1,currentCase.getIdCol(), SOUTH);
		east = setCase(currentCase.getIdRow(),currentCase.getIdCol()+1, EAST);
		north = setCase(currentCase.getIdRow()-1,currentCase.getIdCol(), NORTH);
		west = setCase(currentCase.getIdRow(),currentCase.getIdCol()-1, WEST);
	}

	public Case getSuicideCase() {
		if(south.getCaseType().equals(CaseType.SUICIDE)) {
			return south;
		}
		if(east.getCaseType().equals(CaseType.SUICIDE)) {
			return east;
		}
		if(north.getCaseType().equals(CaseType.SUICIDE)) {
			return north;
		}
		if(west.getCaseType().equals(CaseType.SUICIDE)) {
			return west;
		}
		return null;
	}

	private Case setCase(int idRow, int idCol, Direction comeFrom) {
		if(idRow<0 || idRow>=map.length || idCol<0 || idCol>=map[0].length ) {
			return null;
		}
		return new Case(idRow, idCol, CaseType.getCaseTypeForCharacter(map[idRow][idCol]), comeFrom);
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

	public Case getCurrentCase() {
		return currentCase;
	}

	public Teleporter getTeleporter() {
		return teleporter;
	}

	public BenderMap getBenderMap() {
		return benderMap;
	}

}
