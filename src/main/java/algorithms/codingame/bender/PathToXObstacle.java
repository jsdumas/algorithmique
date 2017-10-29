package algorithms.codingame.bender;

public class PathToXObstacle implements PathFinder {

	@Override
	public Case getNextCase(CaseArea area) {
		return area.getSouth();
	}

}
