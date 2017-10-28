package algorithms.codingame.bender;

public class StateFactory {

	public CaseState getState(char state) {
		CaseState caseState;
		switch (state) {
			case '@':
				caseState = new StartState();
				break;
			case ' ':
				caseState=null;
				break;
			case '#':
				caseState = null;
				break;
			case 'X':
				caseState=null;
				break;
			case 'S':
				caseState = new SouthDirectionState();
				break;
			case 'E':
				caseState= new EastDirectionState();
				break;
			case 'N':
				caseState = new NorthDirectionState();
				break;
			case 'W':
				caseState = new WestDirectionState();
				break;
			case 'I':
				caseState=null;
				break;
			case 'B':
				caseState=null;
				break;
			case 'T':
				caseState=null;
				break;
			case '$':
				caseState=null;
				break;
			default:
				caseState=null;
		}
		return caseState;
	}

}
