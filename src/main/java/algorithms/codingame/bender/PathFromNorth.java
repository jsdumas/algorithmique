package algorithms.codingame.bender;

public class PathFromNorth implements PathFinder {

	private final CaseArea area;

	public PathFromNorth(CaseArea area) {
		this.area = area;
	}

	@Override
	public Case getNextCase() {
		return area.getNorth();
	}

}
