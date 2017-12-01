package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

public class SortGroupsForAllRides {

	private final RollerCoaster rollerCoaster;
	private final GroupsForAllRidesInADay groupsForAllRidesInADay;

	public SortGroupsForAllRides(RollerCoaster rollerCoaster) {
		this.rollerCoaster = rollerCoaster;
		this.groupsForAllRidesInADay = new GroupsForAllRidesInADay(rollerCoaster.getPlaceNumberForARide());
	}

	public GroupsForAllRidesInADay getGroupsForAllRidesInADay() {
		Queue<GroupOfPerson> waitingGroupForThisRide = new LinkedList<GroupOfPerson>();
		waitingGroupForThisRide.addAll(rollerCoaster.getWaitingQueue().getWaitingGroupsOfPersons());
		Queue<GroupOfPerson> waitingGroupForNextRide = new LinkedList<GroupOfPerson>();
		for (long i = 0; i < rollerCoaster.getRideNumberByDay(); i++) {
			if (waitingGroupForThisRide.isEmpty()) {
				waitingGroupForThisRide.addAll(waitingGroupForNextRide);
				waitingGroupForNextRide = new LinkedList<GroupOfPerson>();
			}
			if (groupsForAllRidesInADay.isEmpty()) {
				GroupOfPerson nextGroupForARide = waitingGroupForThisRide.poll();
				groupsForAllRidesInADay.addNewGroupOfRiders(nextGroupForARide);
			}
			while (true) {
				if (waitingGroupForThisRide.isEmpty()) {
					break;
				}
				if (groupsForAllRidesInADay.getLastPassengers() + waitingGroupForThisRide.peek().getNumberOfPerson() < rollerCoaster
						.getPlaceNumberForARide()) {
					GroupOfPerson nextGroupForARide = waitingGroupForThisRide.poll();
					groupsForAllRidesInADay.addToCurrentGroupOfRiders(nextGroupForARide);
				} else {
					break;
				}
			}
		}
		return groupsForAllRidesInADay;
	}

}
