package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

public class Gain {

	private final GroupsSortedForRides groupsSortedForRides;
	private final long numberOfRidesByDay;
	private final RollerCoaster rollerCoaster;
	private final Queue<GroupsByRide> allGroupsByRide;
	private final long numberOfPersonsInRussianMountainsQueue;

	public Gain(RollerCoaster rollerCoaster) {
		this.rollerCoaster = rollerCoaster;
		this.groupsSortedForRides = new GroupsSortedForRides(rollerCoaster);
		new LinkedList<GroupsByRide>();
		this.numberOfRidesByDay = rollerCoaster.getRideNumberByDay();
		this.allGroupsByRide = this.groupsSortedForRides.getAllGroupsByRide();
		this.numberOfPersonsInRussianMountainsQueue = rollerCoaster.getRussianMountainsQueue().getNumberOfPerson();
	}

	public long dailyGainOfRussianMountains() {
		if (rollerCoaster.isPlaceNumberGreaterThanPeople()) {
			return numberOfPersonsInRussianMountainsQueue * numberOfRidesByDay;
		}
		long numberOfRiders = 0;
		for (GroupsByRide groups : allGroupsByRide) {
			numberOfRiders += groups.getNumberOfPersons();
		}
		return numberOfRiders * (numberOfRidesByDay / allGroupsByRide.size());
	}

}
