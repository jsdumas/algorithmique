package algorithms.codingame.rollercoaster;

import java.util.Deque;
import java.util.LinkedList;

public class SortGroupsForAllRides {

	private final RollerCoaster rollerCoaster;
	private final GroupsForRideSerial groupsForRideSerial;

	public SortGroupsForAllRides(RollerCoaster rollerCoaster) {
		this.rollerCoaster = rollerCoaster;
		this.groupsForRideSerial = new GroupsForRideSerial(rollerCoaster.getPlaceNumberForARide());
	}

	public GroupsForRideSerial getGroupsForAllRidesInADay() {
		Deque<GroupOfPerson> waitingGroupForThisRide = new LinkedList<GroupOfPerson>();
		waitingGroupForThisRide.addAll(rollerCoaster.getWaitingQueue().getWaitingGroupsOfPersons());
		GroupOfPerson firstGroup = rollerCoaster.getWaitingQueue().getWaitingGroupsOfPersons().peek();

		for (long i = 0; i < rollerCoaster.getRideNumberByDay(); i++) {
			if (firstGroup == waitingGroupForThisRide.peek() && i != 0) {
				break;
			}
			if (groupsForRideSerial.isEmpty() || (groupsForRideSerial.getLastPassengers() + waitingGroupForThisRide.peek()
					.getNumberOfPerson() > rollerCoaster.getPlaceNumberForARide())) {
				GroupOfPerson nextGroupForARide = waitingGroupForThisRide.poll();
				groupsForRideSerial.addNewGroupOfRiders(nextGroupForARide);
				waitingGroupForThisRide.add(nextGroupForARide);
			}
			while (true) {
				if (groupsForRideSerial.getLastPassengers() + waitingGroupForThisRide.peek().getNumberOfPerson() > rollerCoaster
						.getPlaceNumberForARide()) {
					break;
				}
				GroupOfPerson nextGroupForARide = waitingGroupForThisRide.poll();
				groupsForRideSerial.addToCurrentGroupOfRiders(nextGroupForARide);
				waitingGroupForThisRide.add(nextGroupForARide);
			}
		}
		return groupsForRideSerial;
	}

}
