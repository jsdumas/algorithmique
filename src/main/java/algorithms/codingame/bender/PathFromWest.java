package algorithms.codingame.bender;

public class PathFromWest implements PathFinder {

	@Override
	public Case getNextCase(CaseArea area) {
		return area.getWest();
	}

}
