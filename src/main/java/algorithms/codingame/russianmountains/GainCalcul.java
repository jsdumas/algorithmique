package algorithms.codingame.russianmountains;

import java.util.LinkedList;
import java.util.Queue;

public class GainCalcul {

	private final GroupsSortedForRides rideGroupCombination;
	private final Queue<GroupsByRide> currentQueue;
	private final long rideNumberByDay;

	private final RussianMountains russianMountains;

	public GainCalcul(RussianMountains russianMountains) {
		this.russianMountains = russianMountains;
		this.rideGroupCombination = new GroupsSortedForRides(russianMountains);
		this.currentQueue = new LinkedList<GroupsByRide>();
		this.rideNumberByDay = russianMountains.getRideNumberByDay();
	}

	public long dailyGainOfRussianMountains() {
		if (russianMountains.isPlaceNumberGreaterThanPeople()) {
			RussianMountainsQueue russianMountainsQueue = russianMountains.getRussianMountainsQueue();
			return russianMountainsQueue.getNumberOfPerson() * rideNumberByDay;
		}
		long result = 0;
		currentQueue.addAll(rideGroupCombination.getAllGroupsByRide());
		Queue<GroupsByRide> nextFile = new LinkedList<GroupsByRide>();
		for (long i = 0; i < rideNumberByDay; i++) {
			if (currentQueue.isEmpty()) {
				currentQueue.addAll(nextFile);
				nextFile = new LinkedList<GroupsByRide>();
			}
			GroupsByRide currentGroupRide = currentQueue.poll();
			nextFile.add(currentGroupRide);
			result += currentGroupRide.getPersonNumber();
		}
		return result;
	}

}
