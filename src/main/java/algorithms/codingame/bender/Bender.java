package algorithms.codingame.bender;

import static algorithms.codingame.bender.CaseType.BIER;
import static algorithms.codingame.bender.CaseType.CHARP_OBSTACLE;
import static algorithms.codingame.bender.CaseType.EMPTY;
import static algorithms.codingame.bender.CaseType.INVERSOR;
import static algorithms.codingame.bender.CaseType.SUICIDE;
import static algorithms.codingame.bender.CaseType.X_OBSTACLE;
import static algorithms.codingame.bender.Direction.LOOP;

public class Bender {
	
	private final PathFinderFactory pathFinderFactory;
	private final MemorisePath memorisePath;
	private final BenderMap benderMap;
	private Case currentCase;
	private boolean isInverted;
	private boolean isXBreaker;
	private PathPriority pathPriority;
	
	
	public Bender(BenderMap benderMap) {
		this.pathFinderFactory = new PathFinderFactory();
		this.memorisePath = new MemorisePath();
		this.benderMap=benderMap;
		this.currentCase=benderMap.getStartCase();
		this.isInverted=false;
		this.isXBreaker=false;
		this.pathPriority = new PathPriority();
	}
	
	
	private boolean isBenderOnTheRoad() {
		return currentCase!=null && !currentCase.getCaseType().equals(SUICIDE) && !memorisePath.printDirection().equals(LOOP.toString());
	}
	
	private boolean isCaseWalkable() {
		return currentCase!=null && !currentCase.getCaseType().equals(CHARP_OBSTACLE) && !currentCase.getCaseType().equals(X_OBSTACLE);
	}


	private PathFinder getPathFinder() {
		char type = benderMap.getMap()[currentCase.getIdRow()][currentCase.getIdCol()];
		CaseType caseType = CaseType.getCaseTypeForCharacter(type);
		if(caseType.equals(INVERSOR)){
			isInverted=!isInverted;
		}
		if(caseType.equals(BIER)){
			isXBreaker=!isXBreaker;
		}
		return pathFinderFactory.getPathFinder(caseType, isInverted, isXBreaker);
	}
	
	private void benderWalkOnObstacle(CaseArea area) {
		if(isCaseWalkable()){
			return;
		}
		if(isXBreaker && currentCase.getCaseType().equals(X_OBSTACLE)){
			benderMap.getMap()[currentCase.getIdRow()][currentCase.getIdCol()] = EMPTY.getChar();
		}
		else if(isInverted){
			currentCase = pathPriority.getNextCaseWithInvertedPriority(area, isXBreaker);
		} else {
			currentCase = pathPriority.getNextCaseWithPriority(area, isXBreaker);
		}
	}
	
	
	public void walkToSuicideCase() {
		while(isBenderOnTheRoad()) {
			PathFinder pathFinder = getPathFinder();
			CaseArea area = new CaseArea(currentCase, benderMap);
			currentCase = pathFinder.getNextCase(area);
			benderWalkOnObstacle(area);
			memorisePath.memorise(currentCase, isBenderOnTheRoad());
		}
	}

	

	public boolean isInverted() {
		return isInverted;
	}


	public void setInverted(boolean isInverted) {
		this.isInverted = isInverted;
	}


	public MemorisePath getMemorisePath() {
		return memorisePath;
	}


}
