package algorithms.codingame.bender;

public class PathToSouth implements PathFinder {
	
	@Override
	public Case getNextCase(CaseArea area) {
		return area.getSouth();
	}

}
