package algorithms.codingame.bender;

import static algorithms.codingame.bender.CaseType.INVERSOR;
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
		while(benderIsOnTheRoad()) {
			CaseState currentCaseState = getCurrentCaseState();
			CaseArea area = new CaseArea(currentCase, benderMap.getMap());
				currentCase = currentCaseState.getNextCase(area);
			if(currentCaseState.getDirection().equals(LOOP)) {
				stringBuffer.setLength(0);
				stringBuffer.append(LOOP.toString());
			} else {
				stringBuffer.append(currentCaseState.getDirection().toString());
				if(benderIsOnTheRoad()){
				stringBuffer.append("\n");
				}
			}
		}
	}


	private boolean benderIsOnTheRoad() {
		return currentCase!=null && !currentCase.getCaseType().equals(SUICIDE) && !stringBuffer.toString().equals(LOOP.toString());
	}

	public String printDirection() {
		return stringBuffer.toString();
	}


	private CaseState getCurrentCaseState() {
		char type = benderMap.getMap()[currentCase.getIdRow()][currentCase.getIdCol()];
		CaseType caseType = CaseType.getCaseTypeForCharacter(type);
		if(caseType.equals(INVERSOR)){
			isInverted=!isInverted;
		}
		return stateFactory.getState(caseType);
	}


	public boolean isInverted() {
		return isInverted;
	}


	public void setInverted(boolean isInverted) {
		this.isInverted = isInverted;
	}


}
