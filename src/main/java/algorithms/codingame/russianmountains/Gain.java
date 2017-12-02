package algorithms.codingame.russianmountains;

import java.util.LinkedList;
import java.util.Queue;

public class Gain {

	private final GroupsSortedForRides groupsSortedForRides;
	private final long numberOfRidesByDay;
	private final RollerCoaster russianMountains;
	private final Queue<GroupsByRide> allGroupsByRide;
	private final long numberOfPersonsInRussianMountainsQueue;

	public Gain(RollerCoaster russianMountains) {
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
