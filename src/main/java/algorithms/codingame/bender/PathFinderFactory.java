package algorithms.codingame.bender;

public class PathFinderFactory {

	public PathFinder getPathFinder(CaseType caseType) {
		PathFinder caseState;
		switch (caseType) {
			case START:
				caseState = new PathFromStart();
				break;
			case EMPTY:
				caseState = new PathFromEmptyCase();
				break;
			case X_OBSTACLE:
				caseState = new PathToXObstacle();
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
				caseState = new PathFromInversor();
				break;
			case BIER:
				caseState = new PathFromBier();
				break;
			case TELEPORTER:
				caseState = new PathFromTeleporter();
				break;
			default:
				caseState=null;
		}
		return caseState;
	}

}
