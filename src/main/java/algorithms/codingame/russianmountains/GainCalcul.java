package algorithms.codingame.russianmountains;

import java.util.LinkedList;
import java.util.Queue;

public class GainCalcul {

	private static final int RIDE_PRICE_PERSON = 1;

	private final RideGroupCombination rideGroupCombination;
	private final Queue<GroupByRide> currentQueue;
	private final long rideNumber;

	public GainCalcul(RussianMountains russianMountains) {
		this.rideGroupCombination = new RideGroupCombination(russianMountains);
		this.currentQueue = new LinkedList<GroupByRide>();
		this.rideNumber = russianMountains.getRideNumberByDay();
	}

	public long dailyGainOfRussianMountains() {
		long result = 0;
		currentQueue.addAll(rideGroupCombination.getAllGroupsByRide());
		Queue<GroupByRide> nextFile = new LinkedList<GroupByRide>();
		for (int i = 0; i < rideNumber; i++) {
			if (currentQueue.isEmpty()) {
				currentQueue.addAll(nextFile);
				nextFile = new LinkedList<GroupByRide>();
			}
			GroupByRide currentGroupRide = currentQueue.poll();
			nextFile.add(currentGroupRide);
			result += RIDE_PRICE_PERSON * currentGroupRide.getPersonNumber();
		}
		return result;
	}

}
