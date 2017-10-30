package algorithms.codingame.bender;

public class PathFromTeleporter extends PriorityPathFinder implements PathFinder {
	
	private boolean isInverted;
	private boolean isXBreaker;

	public PathFromTeleporter(boolean isInverted, boolean isXBreaker) {
		this.isInverted = isInverted;
		this.isXBreaker = isXBreaker;
	}

	@Override
	public Case getNextCase(CaseArea area) {
		Teleporter teleporter = area.getTeleporter();
		CaseArea areaToGet;
		if(area.getCurrentCase().getIdRow()==teleporter.getFrom().getIdRow() && area.getCurrentCase().getIdCol()==teleporter.getFrom().getIdCol()){
			areaToGet = new CaseArea(teleporter.getTo(), area.getBenderMap());
		} else {
			areaToGet = new CaseArea(teleporter.getFrom(), area.getBenderMap());
		}
		return super.getNextCase(areaToGet, isInverted, isXBreaker);
	}

}
