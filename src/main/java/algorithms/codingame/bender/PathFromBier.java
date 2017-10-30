package algorithms.codingame.bender;

public class PathFromBier implements PathFinder {

	@Override
	public Case getNextCase(CaseArea area) {
		Case suicideCase = area.getSuicideCase();
		if(suicideCase!=null) {
			return suicideCase;
		}
		return area.getSouth();
	}

}
