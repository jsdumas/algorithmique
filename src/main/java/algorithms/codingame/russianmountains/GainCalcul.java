package algorithms.codingame.russianmountains;

import java.util.Queue;

public class GainCalcul {

	private static final int RIDE_PRICE_PERSON = 1;

	private final RussianMountains russianMountains;

	public GainCalcul(RussianMountains russianMountains) {
		this.russianMountains = russianMountains;
	}

	public long dailyGainOfRussianMountains() {
		long result = 0;
		int rideNumber = russianMountains.getRideNumberByDay();
		Queue<GroupOfPerson> groupQueue = russianMountains.getGroupOfPerson();
		for (int i = 0; i < rideNumber; i++) {
			GroupOfPerson group = groupQueue.poll();
			result = RIDE_PRICE_PERSON * group.getNumberOfPerson();
			groupQueue.add(group);
		}
		return result;
	}

}
