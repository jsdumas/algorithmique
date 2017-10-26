package algorithms.codingame.bender;

public class StateFactory {

	public BenderState getState(char state) {
		BenderState benderState;
		switch (state) {
			case '@':
				benderState = new StartState();
				break;
			case ' ':
				benderState=null;
				break;
			case '#':
				benderState = new CharpObstacleState();
				break;
			case 'X':
				benderState=null;
				break;
			case 'S':
				benderState=null;
				break;
			case 'E':
				benderState=null;
				break;
			case 'N':
				benderState=null;
				break;
			case 'W':
				benderState=null;
				break;
			case 'I':
				benderState=null;
				break;
			case 'B':
				benderState=null;
				break;
			case 'T':
				benderState=null;
				break;
			case '$':
				benderState=null;
				break;
			default:
				benderState=null;
		}
		return benderState;
	}

}
