package algorithms.codingame.bender;

public class PathToInversor implements PathFinder {


	@Override
	public Case getNextCase(CaseArea area) {
		return area.getWest();
	}

}
