package algorithms.codingame.bender;

import static algorithms.codingame.bender.CaseType.BIER;
import static algorithms.codingame.bender.CaseType.CHARP_OBSTACLE;
import static algorithms.codingame.bender.CaseType.EMPTY;
import static algorithms.codingame.bender.CaseType.E_MODIFIER;
import static algorithms.codingame.bender.CaseType.INVERSOR;
import static algorithms.codingame.bender.CaseType.N_MODIFIER;
import static algorithms.codingame.bender.CaseType.START;
import static algorithms.codingame.bender.CaseType.SUICIDE;
import static algorithms.codingame.bender.CaseType.S_MODIFIER;
import static algorithms.codingame.bender.CaseType.TELEPORTER;
import static algorithms.codingame.bender.CaseType.W_MODIFIER;
import static algorithms.codingame.bender.CaseType.X_OBSTACLE;

public class StateFactory {

	public CaseState getState(CaseType caseType) {
		CaseState caseState;
		switch (caseType) {
			case START:
				caseState = new StartState();
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
				caseState = new SouthDirectionState();
				break;
			case E_MODIFIER:
				caseState= new EastDirectionState();
				break;
			case N_MODIFIER:
				caseState = new NorthDirectionState();
				break;
			case W_MODIFIER:
				caseState = new WestDirectionState();
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
