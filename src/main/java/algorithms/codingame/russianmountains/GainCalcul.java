package algorithms.codingame.russianmountains;

public class GainCalcul {

	private static final int RIDE_PRICE_PERSON = 1;

	private final RussianMountains russianMountains;
	private final AllGroupsByRide allGroupsByRide;

	public GainCalcul(RussianMountains russianMountains) {
		this.russianMountains = russianMountains;
		this.allGroupsByRide = new AllGroupsByRide(russianMountains.getPlaceNumber());
	}

	public long dailyGainOfRussianMountains() {
		long result = 0;
		long rideNumber = russianMountains.getRideNumberByDay();
		for (int i = 0; i < rideNumber; i++) {
			// result = RIDE_PRICE_PERSON * group.getNumberOfPerson();
		}
		return result;
	}

}
