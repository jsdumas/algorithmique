package algorithms.codingame.bender;

public class PathToBier implements PathFinder {

	@Override
	public Case getNextCase(CaseArea area) {
		return area.getSouth();
	}

}
