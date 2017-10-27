package algorithms.codingame.bender;

import static algorithms.codingame.bender.CaseType.CHARP_OBSTACLE;
import static algorithms.codingame.bender.CaseType.EMPTY;
import static algorithms.codingame.bender.CaseType.S_MODIFIER;
import static algorithms.codingame.bender.CaseType.X_OBSTACLE;

public class Bender {
	
	private static final StateFactory STATE_FACTORY = new StateFactory();
	private final BenderMap benderMap;
	private Case currentCase;
	private Case nextCase;
	private Direction nextDirection;
	
	
	public Bender(BenderMap benderMap) {
		this.benderMap=benderMap;
		this.currentCase=benderMap.getStartCase();
	}
	
	
	public String walkTo() {
		char state = getState(currentCase);
		CaseState caseState = STATE_FACTORY.getState(state);
		CaseArea area = new CaseArea(currentCase, benderMap.getMap());
		nextCase = caseState.getNextCase(area);
		return caseState.getDirection().toString();
	}




	private char getState(Case caseState) {
		return benderMap.getMap()[caseState.getIdRow()][caseState.getIdCol()];
	}


}
