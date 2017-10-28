package algorithms.codingame.bender;

public class PathToNorth implements PathFinder {

	@Override
	public Case getNextCase(CaseArea area) {
		return area.getNorth();
	}

}
