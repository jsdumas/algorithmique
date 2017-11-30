package algorithms.codingame.rollercoaster;

public class Gain {

	private final RollerCoaster rollerCoaster;

	public Gain(RollerCoaster rollerCoaster) {
		this.rollerCoaster = rollerCoaster;
	}

	public long dailyGainOfRussianMountains() {
		if (rollerCoaster.isPlaceNumberGreaterThanPeople()) {
			RollerCoasterQueue rollerCoasterQueue = rollerCoaster.getWaitingQueue();
			return rollerCoasterQueue.getNumberOfPerson() * rollerCoaster.getRideNumberByDay();
		}
		SortGroupsForAllRides sortGroupsForAllRides = new SortGroupsForAllRides(rollerCoaster);
		GroupsForAllRidesInADay groupsForAllRidesInADay = sortGroupsForAllRides.getGroupsForAllRidesInADay();
		return groupsForAllRidesInADay.getAllpassengersInADay();
	}

}
