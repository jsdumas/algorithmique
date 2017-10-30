package algorithms.codingame.bender;

public class PathFromSouth implements PathFinder {
	
	@Override
	public Case getNextCase(CaseArea area) {
		return area.getSouth();
	}

}
