package algorithms.codingame.bender;

public class PathFinderFactory {

	public PathFinder getPathFinder(CaseType caseType, boolean isInverted, boolean isXBreaker) {
		PathFinder caseState;
		switch (caseType) {
			case START:
				caseState = new PathFromStart();
				break;
			case EMPTY:
				caseState = new PathFromEmptyCase(isInverted, isXBreaker);
				break;
			case X_OBSTACLE:
				caseState = new PathToXObstacle(isInverted, isXBreaker);
				break;
			case S_MODIFIER:
				caseState = new PathFromSouth();
				break;
			case E_MODIFIER:
				caseState= new PathFromEast();
				break;
			case N_MODIFIER:
				caseState = new PathFromNorth();
				break;
			case W_MODIFIER:
				caseState = new PathFromWest();
				break;
			case INVERSOR:
				caseState = new PathFromInversor(isInverted, isXBreaker);
				break;
			case BIER:
				caseState = new PathFromBier(isInverted, isXBreaker);
				break;
			case TELEPORTER:
				caseState = new PathFromTeleporter(isInverted, isXBreaker);
				break;
			default:
				caseState=null;
		}
		return caseState;
	}

}
