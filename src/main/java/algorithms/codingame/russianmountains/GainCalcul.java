package algorithms.codingame.russianmountains;

import java.util.LinkedList;
import java.util.Queue;

public class GainCalcul {

	private final GroupsSortedForRides groupsSortedForRides;
	private final Queue<GroupsByRide> allGroupsByRide;
	private final long rideNumberByDay;

	private final RussianMountains russianMountains;

	public GainCalcul(RussianMountains russianMountains) {
		this.russianMountains = russianMountains;
		this.groupsSortedForRides = new GroupsSortedForRides(russianMountains);
		this.allGroupsByRide = new LinkedList<GroupsByRide>();
		this.rideNumberByDay = russianMountains.getRideNumberByDay();
	}

	public long dailyGainOfRussianMountains() {
		if (russianMountains.isPlaceNumberGreaterThanPeople()) {
			RussianMountainsQueue russianMountainsQueue = russianMountains.getRussianMountainsQueue();
			return russianMountainsQueue.getNumberOfPerson() * rideNumberByDay;
		}
		long result = 0;
		allGroupsByRide.addAll(groupsSortedForRides.getAllGroupsByRide());
		Queue<GroupsByRide> allGroupsForAnotherRide = new LinkedList<GroupsByRide>();
		for (long i = 0; i < rideNumberByDay; i++) {
			if (allGroupsByRide.isEmpty()) {
				allGroupsByRide.addAll(allGroupsForAnotherRide);
				allGroupsForAnotherRide = new LinkedList<GroupsByRide>();
			}
			GroupsByRide currentRiderGroup = allGroupsByRide.poll();
			allGroupsForAnotherRide.add(currentRiderGroup);
			result += currentRiderGroup.getNumberOfPersons();
		}
		return result;
	}

}
