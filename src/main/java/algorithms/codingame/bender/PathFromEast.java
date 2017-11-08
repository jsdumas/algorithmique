package algorithms.codingame.bender;

public class PathFromEast implements PathFinder {

	private final CaseArea area;

	public PathFromEast(CaseArea area) {
		this.area = area;
	}

	@Override
	public Case getNextCase() {
		return area.getEast();
	}

}
