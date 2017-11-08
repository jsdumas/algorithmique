package algorithms.codingame.bender;

public class Walk {

	private final BenderMap benderMap;
	private final MapRules mapRules;

	public Walk(BenderMap benderMap) {
		this.benderMap = benderMap;
		this.mapRules = new MapRules();
	}

	public Case toNextCase(Case currentCase) {
		CaseArea area = new CaseArea(currentCase, benderMap.getMap(), benderMap.getTeletransporter());
		return mapRules.getNextCase(area);
	}

}
