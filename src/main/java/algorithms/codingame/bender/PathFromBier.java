package algorithms.codingame.bender;

public class PathFromBier implements PathFinder {

	@Override
	public Case getNextCase(CaseArea area) {
		return area.getSouth();
	}

}
