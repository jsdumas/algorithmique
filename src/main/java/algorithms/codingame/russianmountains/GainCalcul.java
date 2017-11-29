package algorithms.codingame.russianmountains;

import java.util.LinkedList;
import java.util.Queue;

public class GainCalcul {

	private final GroupsSortedForRides groupsSortedForRides;
	private final long numberOfRidesByDay;
	private final RussianMountains russianMountains;
	private final Queue<GroupsByRide> allGroupsByRide;
	private final long numberOfPersonsInRussianMountainsQueue;

	public GainCalcul(RussianMountains russianMountains) {
		this.russianMountains = russianMountains;
		this.groupsSortedForRides = new GroupsSortedForRides(russianMountains);
		new LinkedList<GroupsByRide>();
		this.numberOfRidesByDay = russianMountains.getRideNumberByDay();
		this.allGroupsByRide = this.groupsSortedForRides.getAllGroupsByRide();
		this.numberOfPersonsInRussianMountainsQueue = russianMountains.getRussianMountainsQueue().getNumberOfPerson();
	}

	public long dailyGainOfRussianMountains() {
		if (russianMountains.isPlaceNumberGreaterThanPeople()) {
			return numberOfPersonsInRussianMountainsQueue * numberOfRidesByDay;
		}
		long numberOfRiders = 0;
		for (GroupsByRide groups : allGroupsByRide) {
			numberOfRiders += groups.getNumberOfPersons();
		}
		return numberOfRiders * (numberOfRidesByDay / allGroupsByRide.size());
	}

}
