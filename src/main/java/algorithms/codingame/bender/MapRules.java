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
	private Case currentCase;

	public MapRules() {
		this.pathFinderFactory = new PathFinderFactory();
		this.pathPriority = new PathPriority();
		this.isInverted = false;
		this.isXBreaker = false;
	}

	private PathFinder getPathFinder(CaseArea area) {
		CaseType currentCaseType = currentCase.getCaseType();
		if (currentCaseType.equals(INVERSOR)) {
			isInverted = !isInverted;
		}
		if (currentCaseType.equals(BIER)) {
			isXBreaker = !isXBreaker;
		}
		return pathFinderFactory.getPathFinder(area, currentCaseType, isInverted, isXBreaker);
	}

	private boolean isCaseWalkable() {
		return currentCase != null && !currentCase.getCaseType().equals(CHARP_OBSTACLE) && !currentCase.getCaseType().equals(X_OBSTACLE);
	}

	private void benderWalkOnObstacle(char[][] map, CaseArea area) {
		if (isCaseWalkable()) {
			return;
		}
		if (isXBreaker && currentCase.getCaseType().equals(X_OBSTACLE)) {
			map[currentCase.getIdRow()][currentCase.getIdCol()] = EMPTY.getChar();
		} else if (isInverted) {
			currentCase = pathPriority.getNextCaseWithInvertedPriority(area, isXBreaker);
		} else {
			currentCase = pathPriority.getNextCaseWithPriority(area, isXBreaker);
		}
	}

	public boolean isInverted() {
		return isInverted;
	}

	public void setInverted(boolean isInverted) {
		this.isInverted = isInverted;
	}

	public Case getNextCase(Case currentCase, char[][] map, Teleporter teletransporter) {
		this.currentCase = currentCase;
		CaseArea area = new CaseArea(currentCase, map, teletransporter);
		PathFinder pathFinder = getPathFinder(area);
		benderWalkOnObstacle(map, area);
		return pathFinder.getNextCase(area);
	}

}
