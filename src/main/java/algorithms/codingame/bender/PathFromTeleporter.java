package algorithms.codingame.bender;

public class PathFromTeleporter extends PriorityPathFinder implements PathFinder {

	private final boolean isInverted;
	private final boolean isXBreaker;
	private final CaseArea area;

	public PathFromTeleporter(CaseArea area, boolean isInverted, boolean isXBreaker) {
		this.area = area;
		this.isInverted = isInverted;
		this.isXBreaker = isXBreaker;
	}

	@Override
	public Case getNextCase() {
		Teleporter teleporter = area.getTeletransporter();
		CaseArea areaToGet;
		if (area.getCurrentCase().getIdRow() == teleporter.getFrom().getIdRow() && area.getCurrentCase().getIdCol() == teleporter.getFrom()
				.getIdCol()) {
			areaToGet = new CaseArea(teleporter.getTo(), area.getMap(), area.getTeletransporter());
		} else {
			areaToGet = new CaseArea(teleporter.getFrom(), area.getMap(), area.getTeletransporter());
		}
		return super.getNextCase(areaToGet, isInverted, isXBreaker);
	}

}
