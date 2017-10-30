package algorithms.codingame.bender;

public class PathFromTeleporter implements PathFinder {
	
	@Override
	public Case getNextCase(CaseArea area) {
		Teleporter teleporter = area.getTeleporter();
		CaseArea areaToGet;
		if(area.getCurrentCase().getIdRow()==teleporter.getFrom().getIdRow() && area.getCurrentCase().getIdCol()==teleporter.getFrom().getIdCol()){
			areaToGet = new CaseArea(teleporter.getTo(), area.getBenderMap());
		} else {
			areaToGet = new CaseArea(teleporter.getFrom(), area.getBenderMap());
		}
		return areaToGet.getSouth();
	}

}
