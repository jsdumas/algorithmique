package algorithms.codingame.bender;

public class PathToEmptyCase implements PathFinder {

	@Override
	public Case getNextCase(CaseArea area) {
		return area.getSouth();
	}

}
