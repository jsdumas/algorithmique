package algorithms.codingame.rollercoaster;

import java.util.Queue;

/** @link GainTest **/
public class Gain {

	private final GroupsSortedForRides groupsSortedForRides;
	private final long numberOfRidesByDay;
	private final RollerCoaster rollerCoaster;
	private final Queue<Ride> allGroupsByRide;
	private final long numberOfRidersInRollerCoaster;

	public Gain(RollerCoaster rollerCoaster) {
		this.rollerCoaster = rollerCoaster;
		this.groupsSortedForRides = new GroupsSortedForRides(rollerCoaster);
		this.numberOfRidesByDay = rollerCoaster.getRideNumberByDay();
		this.allGroupsByRide = this.groupsSortedForRides.getAllGroupsByRide();
		this.numberOfRidersInRollerCoaster = rollerCoaster.getRussianMountainsQueue().getNumberOfPerson();
	}

	public long dailyGainOfRussianMountains() {
		if (rollerCoaster.isPlaceNumberGreaterThanPeople()) {
			return numberOfRidersInRollerCoaster * numberOfRidesByDay;
		}
		long numberOfRiders = 0;
		for (Ride groups : allGroupsByRide) {
			numberOfRiders += groups.getNumberOfRiders();
		}
		return numberOfRiders * (numberOfRidesByDay / allGroupsByRide.size());
	}

}
