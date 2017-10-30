package algorithms.codingame.bender;

public class PathFromEast implements PathFinder {

	@Override
	public Case getNextCase(CaseArea area) {
		return area.getEast();
	}

}
