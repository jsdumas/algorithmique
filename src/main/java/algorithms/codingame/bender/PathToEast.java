package algorithms.codingame.bender;

public class PathToEast implements PathFinder {

	@Override
	public Case getNextCase(CaseArea area) {
		return area.getEast();
	}

}
