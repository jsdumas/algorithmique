package algorithms.codingame.bender;

public class PathFinderFactory {

	public PathFinder getPathFinder(CaseType caseType) {
		PathFinder caseState;
		switch (caseType) {
			case START:
				caseState = new PathFromStart();
				break;
			case EMPTY:
				caseState=null;
				break;
			case CHARP_OBSTACLE:
				caseState = null;
				break;
			case X_OBSTACLE:
				caseState=null;
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
				caseState = new InversorDirectionState();
				break;
			case BIER:
				caseState=null;
				break;
			case TELEPORTER:
				caseState=null;
				break;
			case SUICIDE:
				caseState=null;
				break;
			default:
				caseState=null;
		}
		return caseState;
	}

}
