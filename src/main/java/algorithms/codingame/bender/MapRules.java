package algorithms.codingame.bender;

import static algorithms.codingame.bender.CaseType.BIER;
import static algorithms.codingame.bender.CaseType.CHARP_OBSTACLE;
import static algorithms.codingame.bender.CaseType.EMPTY;
import static algorithms.codingame.bender.CaseType.INVERSOR;
import static algorithms.codingame.bender.CaseType.X_OBSTACLE;

public class MapRules {

	private final PathFinderFactory pathFinderFactory;
	private final PathPriority pathPriority;
	private boolean isInverted;
	private boolean isXBreaker;

	public MapRules() {
		this.pathFinderFactory = new PathFinderFactory();
		this.pathPriority = new PathPriority();
		this.isInverted = false;
		this.isXBreaker = false;
	}

	private PathFinder getPathFinder(CaseArea area) {
		CaseType currentCaseType = area.getCurrentCase().getCaseType();
		if (currentCaseType.equals(INVERSOR)) {
			isInverted = !isInverted;
		}
		if (currentCaseType.equals(BIER)) {
			isXBreaker = !isXBreaker;
		}
		return pathFinderFactory.getPathFinder(area, currentCaseType, isInverted, isXBreaker);
	}


	public boolean isInverted() {
		return isInverted;
	}

	public void setInverted(boolean isInverted) {
		this.isInverted = isInverted;
	}

	public Case getNextCase(CaseArea area) {
		PathFinder pathFinder = getPathFinder(area);
		Case nextCase = pathFinder.getNextCase();
		if(nextCase.getCaseType().equals(CaseType.X_OBSTACLE) && isXBreaker){
			area.getMap()[nextCase.getIdRow()][nextCase.getIdCol()] = EMPTY.getChar();
			nextCase.setEmptyCaseType();
		}
		return nextCase;
	}

}
