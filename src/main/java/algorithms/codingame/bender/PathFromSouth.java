package algorithms.codingame.bender;

public class PathFromSouth implements PathFinder {

	private final CaseArea area;

	public PathFromSouth(CaseArea area) {
		this.area = area;
	}

	@Override
	public Case getNextCase() {
		return area.getSouth();
	}

}
