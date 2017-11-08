package algorithms.codingame.bender;

public class PathFromStart implements PathFinder {

	private final CaseArea area;

	public PathFromStart(CaseArea area) {
		this.area = area;
	}

	@Override
	public Case getNextCase() {
		return area.getSouth();
	}

}
