package algorithms.codingame.bender;

public class PathFromBier extends PathFinderToSuicideCase implements PathFinder {

	@Override
	public Case getNextCase(CaseArea area) {
		return findSuicideCase(area);
	}

}
