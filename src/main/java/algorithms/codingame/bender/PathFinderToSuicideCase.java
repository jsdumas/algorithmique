package algorithms.codingame.bender;

public abstract class PathFinderToSuicideCase {
	
	
	protected Case findSuicideCase(CaseArea area) {
		Case suicideCase = area.getSuicideCase();
		if(suicideCase!=null) {
			return suicideCase;
		}
		return area.getSouth();
	}
	
}
