package algorithms.codingame.bender;

public class PathFromWest implements PathFinder {

	private final CaseArea area;

	public PathFromWest(CaseArea area) {
		this.area = area;
	}

	@Override
	public Case getNextCase() {
		return area.getWest();
	}

}
