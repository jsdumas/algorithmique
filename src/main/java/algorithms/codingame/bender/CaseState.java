package algorithms.codingame.bender;

public interface CaseState {
	
	public Direction getDirection();
	public Case getNextCase(CaseArea area);

}
