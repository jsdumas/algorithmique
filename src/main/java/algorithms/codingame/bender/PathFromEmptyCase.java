package algorithms.codingame.bender;

public class PathFromEmptyCase extends PathFinderToSuicideCase implements PathFinder {

	@Override
	public Case getNextCase(CaseArea area) {
		return findSuicideCase(area);
	}

}
