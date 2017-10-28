package algorithms.codingame.bender;

import static algorithms.codingame.bender.CaseType.CHARP_OBSTACLE;
import static algorithms.codingame.bender.CaseType.INVERSOR;
import static algorithms.codingame.bender.CaseType.SUICIDE;
import static algorithms.codingame.bender.CaseType.X_OBSTACLE;
import static algorithms.codingame.bender.Direction.LOOP;

public class Bender {
	
	private final PathFinderFactory pathFinderFactory = new PathFinderFactory();
	private final StringBuffer stringBuffer = new StringBuffer();
	private final BenderMap benderMap;
	private Case currentCase;
	private boolean isInverted;
	private PathPriority pathPriority;
	
	
	public Bender(BenderMap benderMap) {
		this.benderMap=benderMap;
		this.currentCase=benderMap.getStartCase();
		this.isInverted=false;
		this.pathPriority = new PathPriority();
	}
	
	
	public void walkToSuicideCase() {
		while(benderIsOnTheRoad()) {
			PathFinder pathFinder = getPathFinder();
			CaseArea area = new CaseArea(currentCase, benderMap.getMap());
			currentCase = pathFinder.getNextCase(area);
			if(!isCaseWalkable()){
				if(isInverted){
					currentCase = pathPriority.getNextCaseWithInvertedPriority(area);
				} else {
					currentCase = pathPriority.getNextCaseWithPriority(area);
				}
			}
			if(currentCase.getDirection().equals(LOOP)) {
				stringBuffer.setLength(0);
				stringBuffer.append(LOOP.toString());
			} else {
				stringBuffer.append(currentCase.getDirection().toString());
				if(benderIsOnTheRoad()){
				stringBuffer.append("\n");
				}
			}
		}
	}


	private boolean isCaseWalkable() {
		return currentCase!=null && !currentCase.getCaseType().equals(CHARP_OBSTACLE) && !currentCase.getCaseType().equals(X_OBSTACLE);
	}


	private boolean benderIsOnTheRoad() {
		return currentCase!=null && !currentCase.getCaseType().equals(SUICIDE) && !stringBuffer.toString().equals(LOOP.toString());
	}

	public String printDirection() {
		return stringBuffer.toString();
	}


	private PathFinder getPathFinder() {
		char type = benderMap.getMap()[currentCase.getIdRow()][currentCase.getIdCol()];
		CaseType caseType = CaseType.getCaseTypeForCharacter(type);
		if(caseType.equals(INVERSOR)){
			isInverted=!isInverted;
		}
		return pathFinderFactory.getPathFinder(caseType);
	}


	public boolean isInverted() {
		return isInverted;
	}


	public void setInverted(boolean isInverted) {
		this.isInverted = isInverted;
	}


}
