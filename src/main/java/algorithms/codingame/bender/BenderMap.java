package algorithms.codingame.bender;

public class BenderMap {

	private final char[][] map;
	private final Case startCase;
	private final Case suicideCase;
	private final Teleporter teletransporter;
	private final MapRules mapRules;

	public BenderMap(char[][] map, Case startCase, Case suicideCase, Teleporter teletransporter) {
		this.map = map;
		this.startCase = startCase;
		this.suicideCase = suicideCase;
		this.teletransporter = teletransporter;
		this.mapRules = new MapRules();
	}

	public char[][] getMap() {
		return map;
	}

	public Case getStartCase() {
		return startCase;
	}

	public Case getSuicideCase() {
		return suicideCase;
	}

	public Teleporter getTeletransporter() {
		return teletransporter;
	}

	public Case getNextCase(Case currentCase) {
		return mapRules.getNextCase(currentCase, map, teletransporter);
	}

}
