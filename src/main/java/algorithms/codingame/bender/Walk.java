package algorithms.codingame.bender;

public class Walk {

	private final BenderMap benderMap;
	private final MapRules mapRules;

	public Walk(BenderMap benderMap) {
		this.benderMap = benderMap;
		this.mapRules = new MapRules();
	}

	public Case toNextCase(Case currentCase) {
		return mapRules.getNextCase(currentCase, benderMap.getMap(), benderMap.getTeletransporter());
	}

}
