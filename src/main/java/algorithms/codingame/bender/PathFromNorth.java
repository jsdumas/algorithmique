package algorithms.codingame.bender;

public class PathFromNorth implements PathFinder {

	@Override
	public Case getNextCase(CaseArea area) {
		return area.getNorth();
	}

}
