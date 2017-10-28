package algorithms.codingame.bender;

public class PathFromStart implements PathFinder {

	@Override
	public Case getNextCase(CaseArea area) {
		return area.getSouth();
	}

}
