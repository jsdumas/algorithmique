package algorithms.codingame.bender;

import static algorithms.codingame.bender.CaseType.CHARP_OBSTACLE;
import static algorithms.codingame.bender.CaseType.EMPTY;
import static algorithms.codingame.bender.CaseType.SUICIDE;
import static algorithms.codingame.bender.CaseType.S_MODIFIER;
import static algorithms.codingame.bender.CaseType.X_OBSTACLE;
import static algorithms.codingame.bender.Direction.LOOP;

public class Bender {
	
	private static final StateFactory STATE_FACTORY = new StateFactory();
	private static final StringBuffer STRING_BUFFER = new StringBuffer();
	private final BenderMap benderMap;
	private Case currentCase;
	private Direction nextDirection;
	private String toPrint="";
	
	
	public Bender(BenderMap benderMap) {
		this.benderMap=benderMap;
		this.currentCase=benderMap.getStartCase();
	}
	
	
	public void walkToSuicideCase() {
		while(!currentCase.getCaseType().equals(SUICIDE) && !toPrint.equals(LOOP.toString())) {
			CaseState currentCaseState = getCurrentCaseState();
			CaseArea area = new CaseArea(currentCase, benderMap.getMap());
			currentCase = currentCaseState.getNextCase(area);
			if(currentCaseState.getDirection().equals(LOOP)) {
				toPrint=LOOP.toString();
			} else {
				STRING_BUFFER.append(currentCaseState.getDirection().toString());
				toPrint=STRING_BUFFER.toString();
			}
		}
	}

	public String printDirection() {
		return toPrint;
	}


	private CaseState getCurrentCaseState() {
		char state = benderMap.getMap()[currentCase.getIdRow()][currentCase.getIdCol()];
		return STATE_FACTORY.getState(state);
	}


}
