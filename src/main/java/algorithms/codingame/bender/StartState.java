package algorithms.codingame.bender;

import static algorithms.codingame.bender.CaseType.CHARP_OBSTACLE;
import static algorithms.codingame.bender.CaseType.X_OBSTACLE;

public class StartState implements CaseState {
	
	private Direction direction;


	@Override
	public Direction getDirection() {
		return direction;
	}

	@Override
	public Case getNextCase(Case currentCase, char[][] map) {
		char state = map[currentCase.getIdRow()+1][currentCase.getIdCol()];
		CaseType caseType = CaseType.getCaseTypeForCharacter(state);
		
		if(!caseType.equals(CHARP_OBSTACLE) && !caseType.equals(X_OBSTACLE)){
			direction = Direction.SOUTH;
			return new Case(currentCase.getIdRow()+1,currentCase.getIdCol());
		}
		
		state = map[currentCase.getIdRow()][currentCase.getIdCol()+1];
		caseType = CaseType.getCaseTypeForCharacter(state);
		
		if(!caseType.equals(CHARP_OBSTACLE) && !caseType.equals(X_OBSTACLE)){
			direction = Direction.EAST;
			return new Case(currentCase.getIdRow(),currentCase.getIdCol()+1);
		}
		
		state = map[currentCase.getIdRow()-1][currentCase.getIdCol()];
		caseType = CaseType.getCaseTypeForCharacter(state);
		
		if(!caseType.equals(CHARP_OBSTACLE) && !caseType.equals(X_OBSTACLE)){
			direction =  Direction.NORTH;
			return new Case(currentCase.getIdRow()-1,currentCase.getIdCol());
		}
		
		state = map[currentCase.getIdRow()][currentCase.getIdCol()-1];
		caseType = CaseType.getCaseTypeForCharacter(state);
		
		if(!caseType.equals(CHARP_OBSTACLE) && !caseType.equals(X_OBSTACLE)){
			direction =  Direction.WEST;
			return new Case(currentCase.getIdRow(),currentCase.getIdCol()-1);
		}
		
		direction =  Direction.LOOP;
		return null;
	}
	

}
