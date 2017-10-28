package algorithms.codingame.bender;

public class PathToWest implements PathFinder {

	@Override
	public Case getNextCase(CaseArea area) {
		return area.getWest();
	}

}
