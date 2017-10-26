package algorithms.codingame.bender;

public class Bender {
	
	private static final StateFactory STATE_FACTORY = new StateFactory();
	private final BenderMap benderMap;
	private Case currentCase;
	private Case nextCase;
	
	
	public Bender(BenderMap benderMap) {
		this.benderMap=benderMap;
		this.currentCase=benderMap.getStartCase();
	}
	
	
	public String walkTo() {
		char state = benderMap.getMap()[currentCase.getIdRow()][currentCase.getIdCol()];
		CaseState caseState = STATE_FACTORY.getState(state);
		nextCase = caseState.getNextCase(currentCase);
		
		if(isWalkable(nextCase)) {
			return caseState.getDirection().toString();
		}
		
		return Direction.LOOP.toString();
	}


	private boolean isWalkable(Case nextCase) {
		char state = benderMap.getMap()[nextCase.getIdRow()][nextCase.getIdCol()];
		if(state=='#' || state=='X')
			return false;
		return true;
	}

}
