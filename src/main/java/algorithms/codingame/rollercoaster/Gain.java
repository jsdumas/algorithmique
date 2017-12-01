package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

/** @link GainTest **/
public class Gain {

	private final RollerCoaster rollerCoaster;

	public Gain(RollerCoaster rollerCoaster) {
		this.rollerCoaster = rollerCoaster;
	}

	public long dailyGainOfRollerCoaster() {
		if (rollerCoaster.isPlaceNumberGreaterThanPeople()) {
			RollerCoasterQueue rollerCoasterQueue = rollerCoaster.getWaitingQueue();
			return rollerCoasterQueue.getNumberOfPerson() * rollerCoaster.getRideNumberByDay();
		}
		SortGroupsForAllRides sortGroupsForAllRides = new SortGroupsForAllRides(rollerCoaster);
		GroupsForRideSerial groupsForRideSerial = sortGroupsForAllRides.getGroupsForAllRidesInADay();
		Queue<GroupsByRide> groups = new LinkedList<GroupsByRide>();
		groups.addAll(groupsForRideSerial.getGroupsForRideSerial());

		long result = 0;

		long ridesNumberByDay = rollerCoaster.getRideNumberByDay();
		long countRides = 0;
		while (true) {
			if (countRides + groupsForRideSerial.getNumberOfGroups() > ridesNumberByDay) {
				GroupsByRide groupsByRide = groups.poll();
				countRides++;
				groups.add(groupsByRide);
				result += groupsByRide.getNumberOfPassengers();
			} else {
				countRides += groupsForRideSerial.getNumberOfGroups();
				result += groupsForRideSerial.getAllpassengers();
			}
			if (countRides == ridesNumberByDay) {
				break;
			}
		}

		return result;
	}

}
