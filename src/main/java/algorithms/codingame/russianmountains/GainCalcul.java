package algorithms.codingame.russianmountains;

public class GainCalcul {

	private final RussianMountains russianMountains;

	public GainCalcul(RussianMountains russianMountains) {
		this.russianMountains = russianMountains;
	}

	public long dailyGainOfRussianMountains() {
		long result = russianMountains.getRideNumberByDay() * russianMountains.getGroupOfPerson().size();
		return result;
	}

}
