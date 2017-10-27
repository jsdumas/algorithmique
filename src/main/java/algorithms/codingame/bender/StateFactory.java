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
				caseState=null;
				break;
			case 'E':
				caseState=null;
				break;
			case 'N':
				caseState=null;
				break;
			case 'W':
				caseState=null;
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
