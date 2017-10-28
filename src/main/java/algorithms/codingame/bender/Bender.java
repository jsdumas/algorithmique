package algorithms.codingame.bender;

import static algorithms.codingame.bender.CaseType.SUICIDE;
import static algorithms.codingame.bender.Direction.LOOP;

public class Bender {
	
	private final StateFactory stateFactory = new StateFactory();
	private final StringBuffer stringBuffer = new StringBuffer();
	private final BenderMap benderMap;
	private Case currentCase;
	private boolean isInverted;
	
	
	public Bender(BenderMap benderMap) {
		this.benderMap=benderMap;
		this.currentCase=benderMap.getStartCase();
		this.isInverted=false;
	}
	
	
	public void walkToSuicideCase() {
		while(currentCase!=null && !currentCase.getCaseType().equals(SUICIDE) && !stringBuffer.toString().equals(LOOP.toString())) {
			CaseState currentCaseState = getCurrentCaseState();
			CaseArea area = new CaseArea(currentCase, benderMap.getMap());
				currentCase = currentCaseState.getNextCase(area);
			if(currentCaseState.getDirection().equals(LOOP)) {
				stringBuffer.setLength(0);
				stringBuffer.append(LOOP.toString());
			} else {
				stringBuffer.append(currentCaseState.getDirection().toString());
				if(currentCase!=null && !currentCase.getCaseType().equals(SUICIDE)){
				stringBuffer.append("\n");
				}
			}
		}
	}

	public String printDirection() {
		return stringBuffer.toString();
	}


	private CaseState getCurrentCaseState() {
		char state = benderMap.getMap()[currentCase.getIdRow()][currentCase.getIdCol()];
		return stateFactory.getState(state);
	}


	public boolean isInverted() {
		return isInverted;
	}


	public void setInverted(boolean isInverted) {
		this.isInverted = isInverted;
	}


}
