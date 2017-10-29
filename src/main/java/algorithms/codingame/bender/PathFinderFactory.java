package algorithms.codingame.bender;

public class PathFinderFactory {

	public PathFinder getPathFinder(CaseType caseType) {
		PathFinder caseState;
		switch (caseType) {
			case START:
				caseState = new PathFromStart();
				break;
			case EMPTY:
				caseState = new PathToEmptyCase();
				break;
			case CHARP_OBSTACLE:
				caseState = new PathToCharpObstacle();
				break;
			case X_OBSTACLE:
				caseState = new PathToXObstacle();
				break;
			case S_MODIFIER:
				caseState = new PathToSouth();
				break;
			case E_MODIFIER:
				caseState= new PathToEast();
				break;
			case N_MODIFIER:
				caseState = new PathToNorth();
				break;
			case W_MODIFIER:
				caseState = new PathToWest();
				break;
			case INVERSOR:
				caseState = new PathToInversor();
				break;
			case BIER:
				caseState = new PathToBier();
				break;
			case TELEPORTER:
				caseState = new PathToTeleporter();
				break;
			case SUICIDE:
				caseState = new PathToSuicideCase();
				break;
			default:
				caseState=null;
		}
		return caseState;
	}

}
