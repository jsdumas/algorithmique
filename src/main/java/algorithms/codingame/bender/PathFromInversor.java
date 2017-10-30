package algorithms.codingame.bender;

public class PathFromInversor implements PathFinder {


	@Override
	public Case getNextCase(CaseArea area) {
		return area.getWest();
	}

}
